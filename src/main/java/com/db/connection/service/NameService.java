package com.db.connection.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.connection.dao.repo.NameRepository;
import com.db.connection.model.Colour;
import com.db.connection.model.Name;
import com.db.connection.model.NameDto;
import com.db.connection.model.SubClass;
import com.db.connection.model.SubClass__1;

@Service
public class NameService {

	@Autowired
	NameRepository nameRepository;

	 private int id=1;
	 private int j = 0;
	public List<NameDto> saveOrUpdate(List<Name> name) {
		Colour colour[] = Colour.values();
		
		List<NameDto> nameDtoList = new ArrayList<>();
		Map<Integer,List<SubClass>> map = new TreeMap<>();
		Map<Integer,List<SubClass__1>> mapTwo = new TreeMap<>();
			
		for (Name na : name) {
			if(na.getSubClasses()!= null) {
			map.put(id, na.getSubClasses());
			}
            setter(na.getName(),0,colour,nameDtoList);
            id++;
		}
		for(Map.Entry<Integer, List<SubClass>> e : map.entrySet()) {
			List<SubClass> subList = e.getValue();
			subList.stream().forEach(i -> {setter(i.getName(),e.getKey(),colour, nameDtoList);if(i.getSubClasses() != null) {
				mapTwo.put(id, i.getSubClasses());
			}id++;});
		}
		for(Map.Entry<Integer, List<SubClass__1>> w : mapTwo.entrySet()) {
			List<SubClass__1> subList = w.getValue();
			subList.stream().forEach(i -> {setter(i.getName(),w.getKey(),colour, nameDtoList);id++;});
			
		}	
			
		Collections.sort(nameDtoList, (o1, o2) -> o1.getId().compareTo(o2.getId()));
		return nameDtoList;
	}

	private void setter(String s1, int k, Colour[] colour, List<NameDto> nameDtoList) {
		  NameDto nameDto = new NameDto();
       	 nameDto.setId(id);
			if (j < colour.length) {
				nameDto.setColor(colour[j].toString());
				j++;
			} else {
				j = 0;
				nameDto.setColor(colour[j].toString());
				j++;
			}
			nameDto.setParentid(k);
			nameDto.setName(s1);
			nameRepository.save(nameDto);
			nameDtoList.add(nameDto);
		
	}

}
