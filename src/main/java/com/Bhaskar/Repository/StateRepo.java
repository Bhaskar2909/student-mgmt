package com.Bhaskar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.Entity.State;

public interface StateRepo extends JpaRepository<State, Integer>{

	public List<State> findByCountryId(Integer CountryId);

}
