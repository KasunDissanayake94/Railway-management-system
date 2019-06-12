package com.rst.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.model.Train;
import com.rst.boot.service.TrainServices;


@RestController
@RequestMapping("/train")
public class TrainController {
	
	@Autowired
	private TrainServices trainservice;
	
	@GetMapping("/getTrain")
	public List<Train> getUsers() {
		return trainservice.getAllTrains();
	}
	
	@PostMapping("/addTrain")
	public String saveUser(@RequestBody Train userdata) {
		return trainservice.saveUser(userdata);
	}

}
