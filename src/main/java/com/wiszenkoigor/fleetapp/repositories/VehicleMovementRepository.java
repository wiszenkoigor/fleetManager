package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
