package com.example.Student.entity;

import org.hibernate.annotations.GenericGenerator;

import com.example.Student.dto.StudentDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Student_info")
public class StudentEntity {

	
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "phone_number")
	private Long PhoneNumber;
	
	
	@Column(name = "branch")
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

    
	public StudentEntity() {
		
	}
	
	public StudentEntity(StudentDto dto) {
		this.id = dto.getId();
		this.name = dto.getName();
		this.email = dto.getEmail();
		this.PhoneNumber = dto.getPhoneNumber();
		this.Branch = dto.getBranch();
	}
	
	
	
}
