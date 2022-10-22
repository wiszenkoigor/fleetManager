package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
