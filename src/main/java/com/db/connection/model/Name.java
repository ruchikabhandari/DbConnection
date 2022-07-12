
package com.db.connection.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "Sub Classes"
})
@Generated("jsonschema2pojo")
@Component
public class Name {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Sub Classes")
    private List<SubClass> subClasses = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Sub Classes")
    public List<SubClass> getSubClasses() {
        return subClasses;
    }

    @JsonProperty("Sub Classes")
    public void setSubClasses(List<SubClass> subClasses) {
        this.subClasses = subClasses;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
