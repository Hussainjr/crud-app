package com.example.Student.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Dao.StudentDao;
import com.example.Student.dto.StudentDto;
import com.example.Student.entity.StudentEntity;

@Service
public class StudentService {

	
	
	@Autowired
	private StudentDao dao;

	public StudentEntity saveStudentDetails(StudentDto dto) {
		
		StudentEntity entity=new StudentEntity(dto);
		return dao.saveStudentDetails(entity);
	}

	public StudentEntity findById(Long id) {
		return dao.findById(id);
	}

	public StudentEntity UpdateStudent(StudentDto dto) {
		StudentEntity  entity=findById(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setBranch(dto.getBranch());
		
		return dao.UpdateStudent(entity);
	}

	public void DeleteStudent(Long id) {
		dao.DeleteStudent(id);
	}
	
	public List<StudentEntity> findAllStudent()
	{
		return dao.findAllStudent();
	}
	
	
}
