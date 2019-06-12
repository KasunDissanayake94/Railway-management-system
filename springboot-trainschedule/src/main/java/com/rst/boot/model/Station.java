package com.rst.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "station_name")
	private String station_name;

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	
	
	
	
}
