package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	//Managing the data

}
