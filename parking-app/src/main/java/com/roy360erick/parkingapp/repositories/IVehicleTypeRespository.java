package com.roy360erick.parkingapp.repositories;

import com.roy360erick.parkingapp.entities.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleTypeRespository extends JpaRepository<VehicleType,Long> {
}
