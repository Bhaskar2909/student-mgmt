package com.Bhaskar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.Entity.City;

public interface CityRepo extends JpaRepository<City,Integer>{
	
	public List<City> findByStateId(Integer stateId);

}
