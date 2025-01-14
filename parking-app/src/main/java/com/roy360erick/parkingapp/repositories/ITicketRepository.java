package com.roy360erick.parkingapp.repositories;

import com.roy360erick.parkingapp.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Long> {
}
