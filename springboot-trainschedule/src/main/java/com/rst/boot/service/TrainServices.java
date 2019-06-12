package com.rst.boot.service;

import java.util.List;

import com.rst.boot.model.Train;

public interface TrainServices {

	 List<Train> getAllTrains() ;

	 String saveUser(Train userdata);

}
