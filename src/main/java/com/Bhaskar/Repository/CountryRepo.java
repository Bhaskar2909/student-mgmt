package com.Bhaskar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.Entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer > {

}
