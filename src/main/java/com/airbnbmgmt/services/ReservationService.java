package com.airbnbmgmt.services;

import java.util.List;

import com.airbnbmgmt.models.Reservation;

public interface ReservationService {
	boolean createReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(int reservationId);
    boolean updateReservation(int reservationId, Reservation reservation);
    boolean deleteReservation(int reservationId);
}
