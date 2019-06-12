package com.rst.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.boot.model.Train;
import com.rst.boot.repositories.TrainRepository;
import com.rst.boot.service.TrainServices;

@Service
public class TrainServiceImpl implements TrainServices{
	@Autowired
	private TrainRepository trianRepository;

		
	public List<Train> getAllTrains() {
		List<Train> allUsers = trianRepository.findAll();
		return allUsers;
	}
	//add train
	public String saveUser(Train userdata) {
		trianRepository.save(userdata);
		return "Inserted Train Details";
	}
	

}
