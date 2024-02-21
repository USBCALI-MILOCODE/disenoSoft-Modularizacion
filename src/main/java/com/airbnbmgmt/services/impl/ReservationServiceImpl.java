package com.airbnbmgmt.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.airbnbmgmt.models.Reservation;
import com.airbnbmgmt.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	private final Map<Integer, Reservation> reservations = new HashMap<>();
    private int reservationIdCounter = 0;

    @Override
    public boolean createReservation(Reservation reservation) {
        reservation.setReservationId(++reservationIdCounter);
        reservations.put(reservation.getReservationId(), reservation);
        return true;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations.values());
    }

    @Override
    public Reservation getReservationById(int reservationId) {
        return reservations.get(reservationId);
    }

    @Override
    public boolean updateReservation(int reservationId, Reservation reservation) {
        if (!reservations.containsKey(reservationId)) {
            return false;
        }
        reservation.setReservationId(reservationId);
        reservations.put(reservationId, reservation);
        return true;
    }

    @Override
    public boolean deleteReservation(int reservationId) {
        return reservations.remove(reservationId) != null;
    }
}
