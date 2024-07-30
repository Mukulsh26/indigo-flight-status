package com.indigo.flights.service;

import com.indigo.flights.dto.FlightDetail;
import com.indigo.flights.responses.FlightStatusResponse;


public interface IFlightsService {

    FlightStatusResponse getFlightStatus(String flightNumber);

    void updateFlightStatus(FlightDetail flightDetail);

}
