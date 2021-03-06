package com.paigunna.api.service;

import com.paigunna.api.resource.dto.VehicleDto;

import java.util.List;

/**
 * @author Arm
 */
public interface VehicleTypeService {

    List<VehicleDto> findByUserIdAndDistanceAndVehicleType(Long userId, Long distance, String vehicleType);
}
