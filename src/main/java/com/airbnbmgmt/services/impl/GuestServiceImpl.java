package com.airbnbmgmt.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

import com.airbnbmgmt.models.Guest;
import com.airbnbmgmt.services.GuestService;

@Service
public class GuestServiceImpl implements GuestService {
	
	private final Map<Integer, Guest> guests = new HashMap<>();
	private int guestIdCounter = 0;
	
	@Override
    public boolean createGuest(Guest guest) {
        guest.setGuestId(++guestIdCounter);
        guests.put(guest.getGuestId(), guest);
        return true;
    }

    @Override
    public List<Guest> getAllGuests() {
        return new ArrayList<>(guests.values());
    }

    @Override
    public Guest getGuestById(int guestId) {
        return guests.get(guestId);
    }

    @Override
    public boolean updateGuest(int guestId, Guest guest) {
        if (!guests.containsKey(guestId)) {
            return false;
        }
        
        guest.setGuestId(guestId);
        guests.put(guestId, guest);
        return true;
    }

    @Override
    public boolean deleteGuest(int guestId) {
        return guests.remove(guestId) != null;
    }
    
}
