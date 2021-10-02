package com.klncit.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klncit.home.modal.College;
import com.klncit.home.repository.CollegeRepository;
@RestController
@RequestMapping(value="/college")
public class CollegeController {
	@Autowired
	private CollegeRepository CollegeRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertcollege(@RequestBody final College s){
		CollegeRepo.save(s);			
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student inserted Successfully");
		
	}
	

}
