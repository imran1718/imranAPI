package com.klncit.home.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.klncit.home.modal.College;
public interface CollegeRepository extends CrudRepository<College, Integer> {
	@Query("SELECT logobj FROM College logobj where logobj.Username=?1 and  logobj.Password=?2")	
	public College findyByUsernameAndPassword(String Username,String Password);	
	}
