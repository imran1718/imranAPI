package com.klncit.home.repository;

import org.springframework.data.repository.CrudRepository;
import com.klncit.home.modal.College;
public interface CollegeRepository extends CrudRepository<College, Integer> {
//	@Query("SELECT u from User u where u.username=?1 u.password=?1")	
//	User findOneByUsername(String username);
//	User findOneByPassword(String password);

}
