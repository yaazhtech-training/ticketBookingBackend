package com.yaazhtech.TicketBooking.controller;

import com.yaazhtech.TicketBooking.data.UserTicket;
import com.yaazhtech.TicketBooking.model.TicketRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TicketInterface {
    @PostMapping("/save")
    String ticketDetail(@RequestBody TicketRequest ticketRequest);

    String bookingTicket(TicketRequest ticketRequest);

    @GetMapping("/allTickets")
    List<UserTicket> getAllTickets();

    @GetMapping("/{id}")
    UserTicket getTicketById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    void deleteTicket(@PathVariable Long id);

    @PutMapping("/{id}")
    UserTicket updateTicket(@PathVariable Long id, @RequestBody UserTicket updatedTicket);
}
