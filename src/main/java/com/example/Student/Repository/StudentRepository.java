package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

	
	
}
