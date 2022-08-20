package com.roy360erick.parkingapp.dtos;

import java.util.Date;

public class TicketInvoiceResponse {
    private String carPlate;
    private Date startParking;
    private Date endParking;
    private float totalAmount;

    public TicketInvoiceResponse() {
    }

    public TicketInvoiceResponse(String carPlate, Date startParking, Date endParking, float totalAmount) {
        this.carPlate = carPlate;
        this.startParking = startParking;
        this.endParking = endParking;
        this.totalAmount = totalAmount;
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

    public Date getEndParking() {
        return endParking;
    }

    public void setEndParking(Date endParking) {
        this.endParking = endParking;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
}
