package com.Bhaskar.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CITY_MASTER")
public class City {
	
	@Id
	public Integer cityId;
	
	public String cityName;
	
	public Integer stateId;
	
	public City( Integer cityId,String cityName, Integer stateId) {
		this.cityId=cityId;
		this.cityName = cityName;
		this.stateId = stateId;
	}
	public City() {
	
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	
}
