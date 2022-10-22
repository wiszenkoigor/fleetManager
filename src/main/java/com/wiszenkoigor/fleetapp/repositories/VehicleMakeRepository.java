package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
