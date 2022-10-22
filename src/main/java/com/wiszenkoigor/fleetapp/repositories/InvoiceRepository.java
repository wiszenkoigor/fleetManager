package com.wiszenkoigor.fleetapp.repositories;

import com.wiszenkoigor.fleetapp.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
