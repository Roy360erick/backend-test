package com.roy360erick.parkingapp.dtos;

public class TicketRequest {
    private String carPlate;

    public TicketRequest() {
    }

    public TicketRequest(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
}
