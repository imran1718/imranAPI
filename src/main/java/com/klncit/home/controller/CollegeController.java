package com.klncit.home.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	private CollegeRepository collegeRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertcollege(@RequestBody final College s){		
		collegeRepo.save(s);	
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("college Registered Successfully");
		
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges = (ArrayList<College>) collegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCollege(@PathVariable final int id){
		collegeRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("college deleted Successfully!");
		
	}
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCollege(@PathVariable final int id){
		College college = collegeRepo.findById(id).get();	
        		return ResponseEntity
				.status(HttpStatus.OK)
				.body(college);
	}
	@PostMapping(value="/update")
	public ResponseEntity<?> updateCollege(@RequestBody final College c){
		collegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College update successfully!");
	}	
	@PostMapping(value = "/login")
	public ResponseEntity<?>loginCollege(@RequestBody final College logobj){
		College college = (College) collegeRepo.findyByUsernameAndPassword(logobj.getUsername(),logobj.getPassword());		
		int collegeId;	
		
		if(college!=null) {
			collegeId = college.getId();
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(collegeId);
	}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");	
		}
	}		
}
	

