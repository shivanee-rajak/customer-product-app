package com.dxctraining.productmgt.dto;

public class ProductDto {
	
	private String id;
	private String name;
	
	public ProductDto(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ProductDto() {
		this("","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
