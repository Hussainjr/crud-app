package com.example.Student.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student.Repository.StudentRepository;
import com.example.Student.entity.StudentEntity;

@Repository
public class StudentDao {

	
	
	@Autowired
	private StudentRepository repository;
	
	public StudentEntity saveStudentDetails(StudentEntity entity)
	{
		return repository.save(entity);
	}
	
	public StudentEntity findById(Long id)
	{
		return  repository.getById(id);
	}
	
	public StudentEntity UpdateStudent(StudentEntity entity)
	{
		return repository.save(entity);
	}
	
	public void DeleteStudent(Long id)
	{
		repository.deleteById(id);
	}
	 public List<StudentEntity> findAllStudent()
	 {
		 return repository.findAll();
	 }
	
}
