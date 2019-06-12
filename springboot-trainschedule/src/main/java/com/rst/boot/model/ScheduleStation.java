package com.rst.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shedule_stations")
public class ScheduleStation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "arrivel_time")
	private String arrivel_time;
	
	@Column(name = "dep_time")
	private String dep_time;
	
	@ManyToOne
    @JoinColumn
    private Station station;

	public ScheduleStation(Integer iD, String arrivel_time, String dep_time, Station station) {
		super();
		ID = iD;
		this.arrivel_time = arrivel_time;
		this.dep_time = dep_time;
		this.station = station;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getArrivel_time() {
		return arrivel_time;
	}

	public void setArrivel_time(String arrivel_time) {
		this.arrivel_time = arrivel_time;
	}

	public String getDep_time() {
		return dep_time;
	}

	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
	
	
	
	

}
