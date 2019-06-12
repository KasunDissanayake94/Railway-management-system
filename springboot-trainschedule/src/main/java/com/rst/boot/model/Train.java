package com.rst.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train")
public class Train {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer ID;

	@Column(name = "train_name")
	private String train_name;

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
}
