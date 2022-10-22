package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
