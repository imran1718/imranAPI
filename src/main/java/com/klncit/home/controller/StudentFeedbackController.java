package com.klncit.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klncit.home.modal.Sfeedback;
import com.klncit.home.repository.SfeedbackRepository;



@RestController
@RequestMapping(value="/studentfeedback")
public class StudentFeedbackController {
	@Autowired
	private SfeedbackRepository sfeedbackRepo;
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertsfeedback(@RequestBody final Sfeedback s){
		sfeedbackRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Feedback sent Successfully");
		
	}

}
