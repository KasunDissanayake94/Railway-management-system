package com.rst.boot.service;

import java.util.List;

import com.rst.boot.model.Station;
import com.rst.boot.model.Train;

public interface StationService {
	
	List<Station> getAllStations() ;

	 String saveStation(Station station);

}
