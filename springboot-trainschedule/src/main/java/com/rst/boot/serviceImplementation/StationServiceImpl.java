package com.rst.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.boot.model.Station;
import com.rst.boot.model.Train;
import com.rst.boot.repositories.StationRepository;
import com.rst.boot.service.StationService;

@Service
public class StationServiceImpl implements StationService{
	
	@Autowired
	private StationRepository stationRepository;
	
	public List<Station> getAllStations() {
		List<Station> allStations = stationRepository.findAll();
		return allStations;
	}
	//add train
	public String saveStation(Station station) {
		stationRepository.save(station);
		return "Inserted Station Details";
	}

}
