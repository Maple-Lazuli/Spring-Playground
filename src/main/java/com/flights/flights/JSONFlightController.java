package com.flights.flights;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class JSONFlightController {


    @GetMapping("/flight")
    public Flight getFlight() throws ParseException {
        Flight flight = new Flight();

        //Create Flt Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String strFlightDate = "2017-04-21 14:34";
        LocalDateTime flightDate = LocalDateTime.parse(strFlightDate, formatter);
        flight.setDepartsOn(flightDate);


        Flight.Person person = new Flight.Person();
        person.setFirstName("Some name");
        person.setLastName("Some other name");

        Flight.Passenger passenger = new Flight.Passenger();
        passenger.setPerson(person);
        passenger.setPrice(200);

        ArrayList<Flight.Passenger> passengers = new ArrayList<>();
        passengers.add(passenger);

        flight.setTickets(passengers);

        return flight;
    }






}
