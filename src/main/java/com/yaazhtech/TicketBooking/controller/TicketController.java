package com.yaazhtech.TicketBooking.controller;

import com.yaazhtech.TicketBooking.data.UserTicket;
import com.yaazhtech.TicketBooking.model.TicketRequest;
import com.yaazhtech.TicketBooking.repository.TicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/ticket/booking")//particular controller class endpoint name
public class TicketController implements TicketInterface {
    @Autowired//for importing entire class somewhere
    TicketRepository ticketRepository;

    @Override
    @PostMapping("/save")

    public String ticketDetail(@RequestBody TicketRequest ticketRequest){
        //construct the entity object(construct the entity object for data class)
        UserTicket userTicket=new UserTicket();
        userTicket.setName(ticketRequest.getName());//object reference for getting
        userTicket.setMobile(ticketRequest.getMobile());
        userTicket.setEmail(ticketRequest.getEmail());
        userTicket.setMovieTime(ticketRequest.getMovieTime());
        userTicket.setMovieTitle(ticketRequest.getMovieTitle());
        userTicket.setNoOfPeople(ticketRequest.getNoOfPeople());
        userTicket.setSeatType(ticketRequest.getSeatType());
        userTicket.setSeatLocation(ticketRequest.getSeatLocation());
        userTicket.setTicketId(ticketRequest.getTicketId());
        userTicket.setShowSession(ticketRequest.getShowSession());

        //JPA repository method to save the data in DB
     ticketRepository.save(userTicket);
        System.out.println(userTicket.toString());
        return "Your ticket has been booked successfully";
    }


    @Override
    public String bookingTicket(TicketRequest ticketRequest) {
        return null;
    }


    @Override
    @GetMapping("/allTickets")
    public List<UserTicket> getAllTickets() {
        return ticketRepository.findAll();

    }

    @Override
    @GetMapping("/{id}")
    public UserTicket getTicketById(@PathVariable Long id) {
        return ticketRepository.findById(id).orElse(null);//if my id is there it will give my particular id data oresle if id is not there it will give null

    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
      ticketRepository.deleteById(id);

    }

    @Override
    @PutMapping("/{id}")
    public UserTicket updateTicket(@PathVariable Long id, @RequestBody UserTicket updatedTicket) {

        UserTicket existingTicket=ticketRepository.findById(id).orElse(null);
        if(existingTicket!=null){

            existingTicket.setMobile(updatedTicket.getMobile());

            existingTicket.setSeatType(updatedTicket.getSeatType());
        }
        return ticketRepository.save(existingTicket);

    }

}
