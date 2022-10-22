package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
