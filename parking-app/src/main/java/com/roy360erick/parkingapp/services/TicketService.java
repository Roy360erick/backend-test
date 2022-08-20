package com.roy360erick.parkingapp.services;

import com.roy360erick.parkingapp.dtos.TicketInvoiceResponse;
import com.roy360erick.parkingapp.dtos.TicketRequest;
import com.roy360erick.parkingapp.dtos.TicketResponse;
import com.roy360erick.parkingapp.entities.ParkingHistory;
import com.roy360erick.parkingapp.entities.Ticket;
import com.roy360erick.parkingapp.repositories.IParkingHistoryRepository;
import com.roy360erick.parkingapp.repositories.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.temporal.ChronoUnit.*;

@Service
public class TicketService implements ITicketService{

    @Autowired
    private ITicketRepository ticketRepository;

    @Autowired
    private IParkingHistoryRepository parkingHistoryRepository;

    @Override
    public TicketResponse getTicket(String carPlate) {
        ParkingHistory parkingHistory = this.parkingHistoryRepository
                .findByCarPlateAndActive(carPlate,true);
        TicketResponse response = new TicketResponse( parkingHistory.getCarPlate(), parkingHistory.getStartParking());
        return response;
    }
    @Override
    public TicketResponse generateTicket(TicketRequest ticketRequest) {
        ParkingHistory parkingHistory =  new ParkingHistory(ticketRequest.getCarPlate());
        parkingHistory.setStartParking(new Date(2022,8,20,10,00));
        this.parkingHistoryRepository.save(parkingHistory);

        TicketResponse response = new TicketResponse(
                parkingHistory.getCarPlate(), parkingHistory.getStartParking());
        return response;
    }
    @Override
    public TicketInvoiceResponse generateInvoce(TicketRequest ticketRequest) {
        ParkingHistory parkingHistory = this.parkingHistoryRepository.findByCarPlateAndActive(ticketRequest.getCarPlate(),true);
        parkingHistory.setActive(false);
        parkingHistory.setEndParking(new Date());
        this.parkingHistoryRepository.save(parkingHistory);

        LocalDateTime startDate = parkingHistory.getStartParking().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        LocalDateTime endDate = parkingHistory.getEndParking().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        long numberOFMinutes = MINUTES.between(endDate, startDate);
        float totalAmount = (float) (numberOFMinutes * 0.5);

        Ticket ticket = new Ticket(parkingHistory,(int)numberOFMinutes, totalAmount,true,new Date());


        TicketInvoiceResponse response = new TicketInvoiceResponse(
                parkingHistory.getCarPlate(), parkingHistory.getStartParking(),
                parkingHistory.getEndParking(), totalAmount);
        return response;
    }
}
