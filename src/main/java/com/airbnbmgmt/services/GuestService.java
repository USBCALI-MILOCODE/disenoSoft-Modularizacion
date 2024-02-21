package com.airbnbmgmt.services;

import java.util.List;

import com.airbnbmgmt.models.Guest;

public interface GuestService {
	boolean createGuest(Guest guest);
    List<Guest> getAllGuests();
    Guest getGuestById(int guestId);
    boolean updateGuest(int guestId, Guest guest);
    boolean deleteGuest(int guestId);
}
