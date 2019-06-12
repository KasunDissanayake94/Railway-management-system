package com.rst.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.boot.model.Train;

public interface TrainRepository extends JpaRepository<Train, Integer>{

}
