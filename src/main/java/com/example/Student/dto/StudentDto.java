package com.example.Student.dto;
import lombok.Data;

@Data
public class StudentDto {

	private Long id;
	
	private String name;
	
	private String email;
	
	private Long PhoneNumber;
	
	private String Branch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	
	
	
}
