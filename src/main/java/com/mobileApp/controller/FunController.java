package com.mobileApp.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fun")
@CrossOrigin(origins = "*")
public class FunController {
	@GetMapping("/tellAboutRaghava")
	public String getRaghavaDetails() {
		System.out.println(LocalDateTime.now() +": Triggered the application for raghava");
		return "Recently he got the name Beeramguda Bhai, as he got the popularity because of his craze.";
	}
	
	@GetMapping("/tellAboutMadhu")
	public String getMadhuDetails() {
		System.out.println(LocalDateTime.now() +": Triggered the application for Madhu");
		return "We can tell anything about him, he can align stories better and recently awarded as pullala madhu instead of pilla madhu ganesh";
	}
	
	@GetMapping("/tellAboutSainath")
	public String getSainathDetails() {
		System.out.println(LocalDateTime.now() +": Triggered the application for Sainath");
		return "I'm still confused whether its Sainath or Sainadh, whatever dhula is the best.";
	}
}
