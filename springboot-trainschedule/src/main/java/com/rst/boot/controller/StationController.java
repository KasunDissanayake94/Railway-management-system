package com.rst.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.model.Station;
import com.rst.boot.model.Train;
import com.rst.boot.service.StationService;

@RestController
@RequestMapping("/stations")
public class StationController {
	
	@Autowired
	private StationService stationService;
	
	@GetMapping("/getStations")
	public List<Station> getStations() {
		return stationService.getAllStations();
	}
	
	@PostMapping("/addTrain")
	public String saveUser(@RequestBody Station station) {
		return stationService.saveStation(station);
	}

}
