package com.anupcodes.Car_Rental.services.auth.admin;

import com.anupcodes.Car_Rental.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    boolean updateCar(Long id, CarDto carDto);
}
