package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
