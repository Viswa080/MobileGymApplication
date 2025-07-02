package com.mobileApp.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileApp.models.WorkoutEntry;
import com.mobileApp.repository.WorkoutRepository;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "*")
public class WorkoutController {

	@Autowired
	private WorkoutRepository repo;
	

	@PostMapping
	public WorkoutEntry addWorkout(@RequestBody WorkoutEntry entry) {
		return repo.save(entry);
	}

	@GetMapping
	public List<WorkoutEntry> getAllWorkouts() {
		return repo.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		System.out.println("Triggered the application");
		return "Triggered the application";
	}
	
	@GetMapping("/getParts")
	public List<String> getParts() {
		System.out.println(LocalDateTime.now() +": Triggered the application for parts");
		List<String> list = Arrays.asList("Chest","Back","Shoulders","Legs","Biceps","Triceps","Cardio"); 
		return list;
	}
	@GetMapping("{part}/variations")
	public List<String> getVariations(@PathVariable String part) {
		System.out.println(LocalDateTime.now() +": Triggered the application for variations with "+part);
		List<String> list = Arrays.asList("inclined", "Declined", "Flat"); 
		return list;
	}
	@GetMapping("weights")
	public List<Number> getWeights() {
		System.out.println(LocalDateTime.now() +": Triggered the application for weights");
		List<Number> list = Arrays.asList(1,2,5,7.5,10,12.5,15,17.5,20,22.5,25,27.5,30,32.5,35,37.5,40); 
		return list;
	}
	
	
}
