package com.example.cats.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category 
{
	@JsonProperty("name")
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
