package com.flights.flights;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {

    private int id;
    private String destination;
    private LocalDateTime departsOn;

    public ArrayList<Passenger> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Passenger> tickets) {
        this.tickets = tickets;
    }

    private ArrayList<Passenger> tickets;

        @JsonProperty("departs")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        public LocalDateTime getDepartsOn() { return departsOn; }

        public void setDepartsOn(LocalDateTime dateTime) { this.departsOn = dateTime; }

        static class Person {
            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            private String firstName;

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            private String lastName;
        }
        static class Passenger {
            @JsonProperty("passenger")
            public Person getPerson() {
                return person;
            }

            public void setPerson(Person person) {
                this.person = person;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            private Person person;
            private int price;
        }
}
