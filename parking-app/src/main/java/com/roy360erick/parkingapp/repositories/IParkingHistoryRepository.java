package com.roy360erick.parkingapp.repositories;


import com.roy360erick.parkingapp.entities.ParkingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingHistoryRepository extends JpaRepository<ParkingHistory,Long> {
    public ParkingHistory findByCarPlateAndActive(String cardPlate, boolean active);
}
