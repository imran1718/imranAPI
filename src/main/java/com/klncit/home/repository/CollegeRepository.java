package com.klncit.home.repository;

import org.springframework.data.repository.CrudRepository;
import com.klncit.home.modal.College;
public interface CollegeRepository extends CrudRepository<College, Integer> {
}