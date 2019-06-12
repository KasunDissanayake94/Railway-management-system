package com.rst.boot.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "train_schedule")
public class TrainSchedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer ID;
	
	@ManyToOne
    @JoinColumn
    private Train train;
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public ScheduleStation getScheduleStation() {
		return scheduleStation;
	}

	public void setScheduleStation(ScheduleStation scheduleStation) {
		this.scheduleStation = scheduleStation;
	}

	public Date getOperating_dayDate() {
		return operating_dayDate;
	}

	public void setOperating_dayDate(Date operating_dayDate) {
		this.operating_dayDate = operating_dayDate;
	}

	public SheduleDate getDate() {
		return date;
	}

	public void setDate(SheduleDate date) {
		this.date = date;
	}

	public TrainSchedule(Integer iD, Train train, ScheduleStation scheduleStation, Date operating_dayDate,
			SheduleDate date) {
		super();
		ID = iD;
		this.train = train;
		this.scheduleStation = scheduleStation;
		this.operating_dayDate = operating_dayDate;
		this.date = date;
	}

	@ManyToOne
    @JoinColumn
    private ScheduleStation scheduleStation;
	
	@Column(name="operating_day")
	private Date operating_dayDate;
	
	@ManyToOne
    @JoinColumn
    private SheduleDate date;
	
	
	
	

}
