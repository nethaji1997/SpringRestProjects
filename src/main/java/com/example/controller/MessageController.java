package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/generate")
	public String generateMessage()
	{
		LocalDateTime localDateTime=LocalDateTime.now();
		int hour = localDateTime.getHour();
		if(hour<12)
		{
			return "Good Morning";
		}
		else
		{
			return "Good Night";
		}
	}
}
