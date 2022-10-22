package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
