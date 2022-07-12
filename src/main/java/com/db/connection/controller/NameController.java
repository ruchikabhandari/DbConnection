package com.db.connection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.connection.model.Name;
import com.db.connection.model.NameDto;
import com.db.connection.service.NameService;

@RestController  
public class NameController   
{  
//autowired the StudentService class  
@Autowired  
NameService studentService;  

@PostMapping("/student")  
private List<NameDto> saveStudent(@RequestBody List<Name> name)   
{  
	return studentService.saveOrUpdate(name);  
  
}  
}  
