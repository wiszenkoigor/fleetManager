package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
