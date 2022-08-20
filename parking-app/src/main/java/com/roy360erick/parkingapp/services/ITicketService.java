package com.roy360erick.parkingapp.services;


import com.roy360erick.parkingapp.dtos.TicketInvoiceResponse;
import com.roy360erick.parkingapp.dtos.TicketRequest;
import com.roy360erick.parkingapp.dtos.TicketResponse;

public interface ITicketService {

    public TicketResponse getTicket(String carPlate);
    public TicketResponse generateTicket(TicketRequest ticketRequest);
    public TicketInvoiceResponse generateInvoce(TicketRequest ticketRequest);
}
