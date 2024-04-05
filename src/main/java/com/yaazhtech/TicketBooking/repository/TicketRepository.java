package com.yaazhtech.TicketBooking.repository;

import com.yaazhtech.TicketBooking.data.UserTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<UserTicket,Long> {

}
