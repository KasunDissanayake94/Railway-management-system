package com.rst.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.boot.model.Station;

public interface StationRepository extends JpaRepository<Station, Integer>{

}
