package com.roy360erick.parkingapp.dtos;

import java.util.Date;

public class TicketResponse {
    private String carPlate;
    private Date startParking;
    public TicketResponse() {
    }

    public TicketResponse(String carPlate, Date startParking) {
        this.carPlate = carPlate;
        this.startParking = startParking;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public Date getStartParking() {
        return startParking;
    }

    public void setStartParking(Date startParking) {
        this.startParking = startParking;
    }
}
