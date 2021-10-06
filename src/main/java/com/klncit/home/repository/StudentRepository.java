package com.klncit.home.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.klncit.home.modal.Student;



public interface StudentRepository extends CrudRepository<Student, Integer> {
	@Query("SELECT sl FROM Student sl where sl.Username=?1 and  sl.Password=?2")	
	public Student findyByUsernameAndPassword(String Username,String Password);	
	}
