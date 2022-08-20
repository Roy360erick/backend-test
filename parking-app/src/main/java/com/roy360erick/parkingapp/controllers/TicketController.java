package com.roy360erick.parkingapp.controllers;

import com.roy360erick.parkingapp.dtos.TicketInvoiceResponse;
import com.roy360erick.parkingapp.dtos.TicketRequest;
import com.roy360erick.parkingapp.dtos.TicketResponse;
import com.roy360erick.parkingapp.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {
    @Autowired
    private ITicketService ticketService;

    @GetMapping("/prueba")
    public String prueba(){
        return "Prueba";
    }

    @GetMapping("/ticket/{cardPlate}")
    public TicketResponse getTicket(@PathVariable String cardPlate){
        return this.ticketService.getTicket(cardPlate);
    }

    @PostMapping("/generate-ticket")
    public TicketResponse generateTicket( @RequestBody TicketRequest ticketRequest){
        return this.ticketService.generateTicket(ticketRequest);
    }

    @PostMapping("/generate-invoice")
    public TicketInvoiceResponse generateInvoce(@RequestBody TicketRequest ticketRequest){
        return this.ticketService.generateInvoce(ticketRequest);
    }
}
