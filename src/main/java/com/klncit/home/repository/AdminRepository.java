package com.klncit.home.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.klncit.home.modal.Admin;


public interface AdminRepository extends CrudRepository<Admin, Integer> {
	@Query("SELECT logobj FROM Admin logobj where logobj.Username=?1 and  logobj.Password=?2")	
	public Admin findyByUsernameAndPassword(String Username,String Password);	
	}
