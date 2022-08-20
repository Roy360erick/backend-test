package com.roy360erick.parkingapp.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "parking_history")
public class ParkingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carPlate;
    private Date startParking;
    private Date endParking;
    private boolean active;
    private boolean enabled;

    public ParkingHistory() {
    }

    public ParkingHistory(String carPlate) {
        this.carPlate = carPlate;
        this.active = true;
        //this.startParking = new Date();
        this.enabled = true;
    }

    public ParkingHistory(Long id, String carPlate, Date startParking, Date endParking, boolean active, boolean enabled) {
        this.id = id;
        this.carPlate = carPlate;
        this.startParking = startParking;
        this.endParking = endParking;
        this.active = active;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
