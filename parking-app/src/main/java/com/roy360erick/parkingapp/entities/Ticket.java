package com.roy360erick.parkingapp.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parking_history_id")
    private ParkingHistory parkingHistory;

    private int parkingTime;
    private float totalAmount;
    private boolean enabled;
    private Date createAt;

    public Ticket() {
    }

    public Ticket(Long id, ParkingHistory parkingHistory, int parkingTime, float totalAmount, boolean enabled, Date createAt) {
        this.id = id;
        this.parkingHistory = parkingHistory;
        this.parkingTime = parkingTime;
        this.totalAmount = totalAmount;
        this.enabled = enabled;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParkingHistory getParkingHistory() {
        return parkingHistory;
    }

    public void setParkingHistory(ParkingHistory parkingHistory) {
        this.parkingHistory = parkingHistory;
    }

    public int getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
