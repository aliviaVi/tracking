package com.telran.dto;


import com.telran.entity.StatusTracking;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrackingDto {
    StatusTracking status;
    ShipmentDto shipment;
}
