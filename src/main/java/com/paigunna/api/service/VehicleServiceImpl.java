package com.paigunna.api.service;

import com.paigunna.api.domain.Vehicle;
import com.paigunna.api.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Arm
 */
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }
}
