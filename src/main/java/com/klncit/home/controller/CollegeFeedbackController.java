package com.klncit.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klncit.home.modal.Feedback;

import com.klncit.home.repository.CfeedbackRepository;

@RestController
@RequestMapping(value="/collegefeedback")
public class CollegeFeedbackController {
	@Autowired
	private CfeedbackRepository feedbackRepo;
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertfeedback(@RequestBody final Feedback f){
		feedbackRepo.save(f);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Feedback sent Successfully");
		
	}

}
