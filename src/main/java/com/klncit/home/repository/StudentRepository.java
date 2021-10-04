package com.klncit.home.repository;

import org.springframework.data.repository.CrudRepository;

import com.klncit.home.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
