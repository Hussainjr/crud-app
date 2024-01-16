package com.example.Student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Service.StudentService;
import com.example.Student.dto.StudentDto;
import com.example.Student.entity.StudentEntity;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	
	@PostMapping("/saveStudentDetails")
	public @ResponseBody StudentEntity saveStudentDetails(@RequestBody StudentDto dto) {
		
		return service.saveStudentDetails(dto);
	}
	
	
    @GetMapping("/findById")
	public @ResponseBody StudentEntity findById(@RequestParam("id") Long id) {
		return service.findById(id);
	}

    @PostMapping("/UpdateStudent")
	public @ResponseBody StudentEntity UpdateStudent(@RequestBody StudentDto dto) {
		return service.UpdateStudent(dto);
	}

    
    @DeleteMapping("/DeleteStudent")
	public void DeleteStudent(@RequestParam Long id) {
		service.DeleteStudent(id);
	}
	
    @GetMapping("/findAll")
    public List<StudentEntity> findAll()
    {
    	return service.findAllStudent();
    }
	
	

}
