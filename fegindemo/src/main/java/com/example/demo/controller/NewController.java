package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

	@GetMapping
	public String showName()
	{
		return "hello world";
	}
	
	@GetMapping
	public String showAddress()
	{
		return "vmd";
	}
}
