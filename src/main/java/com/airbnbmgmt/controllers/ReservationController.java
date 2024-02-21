package com.airbnbmgmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbnbmgmt.models.Reservation;
import com.airbnbmgmt.services.ReservationService;

@RestController
@RequestMapping("airbnb/reservations")
public class ReservationController {

	@Autowired
    private ReservationService reservationService;

    @PostMapping
    public boolean createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservationById(@PathVariable int reservationId) {
        return reservationService.getReservationById(reservationId);
    }

    @PutMapping("/{reservationId}")
    public boolean updateReservation(@PathVariable int reservationId, @RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservationId, reservation);
    }

    @DeleteMapping("/{reservationId}")
    public boolean deleteReservation(@PathVariable int reservationId) {
        return reservationService.deleteReservation(reservationId);
    }
}
