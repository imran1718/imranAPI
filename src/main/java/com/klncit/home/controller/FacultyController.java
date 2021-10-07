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

import com.klncit.home.modal.Faculty;

import com.klncit.home.repository.FacultyRepository;


@RestController
@RequestMapping(value="/faculty")
public class FacultyController {
	@Autowired
	private FacultyRepository facultyRepo;	
	

	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertfaculty(@RequestBody final Faculty s){
		facultyRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty Added Successfully");
		
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllFacultys(){
		ArrayList<Faculty> students = (ArrayList<Faculty>) facultyRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(students);
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteFaculty(@PathVariable final int id){
		facultyRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student deleted Successfully!");
		
	}

}
