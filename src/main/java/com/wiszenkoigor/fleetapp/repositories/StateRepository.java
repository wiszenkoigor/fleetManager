package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
