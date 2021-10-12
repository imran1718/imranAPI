package com.klncit.home.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klncit.home.modal.Sendrequest;
import com.klncit.home.repository.SendrequestRepository;

@RestController
@RequestMapping(value="/sendrequest")
public class SendrequestController {	
	
		@Autowired
		private SendrequestRepository sendrequestRepo;
		@PostMapping(value = "/insert")
		public ResponseEntity<?>insertsendrequest(@RequestBody final Sendrequest s){
			sendrequestRepo.save(s);		
		
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("Feedback sent Successfully");
			
		}
		@GetMapping(value = "/getAll")
		public ResponseEntity<?> getAllsendrequests(){
			ArrayList<Sendrequest> feedbacks = (ArrayList<Sendrequest>) sendrequestRepo.findAll();
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(feedbacks);
		}
	}



