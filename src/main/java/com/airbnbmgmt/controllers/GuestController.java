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

import com.airbnbmgmt.models.Guest;
import com.airbnbmgmt.services.GuestService;

@RestController
@RequestMapping("/airbnb/guests")
public class GuestController {
	
	@Autowired
    private GuestService guestService;

    @PostMapping
    public boolean createGuest(@RequestBody Guest guest) {
        return guestService.createGuest(guest);
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @GetMapping("/{guestId}")
    public Guest getGuestById(@PathVariable int guestId) {
        return guestService.getGuestById(guestId);
    }

    @PutMapping("/{guestId}")
    public boolean updateGuest(@PathVariable int guestId, @RequestBody Guest guest) {
        return guestService.updateGuest(guestId, guest);
    }

    @DeleteMapping("/{guestId}")
    public boolean deleteGuest(@PathVariable int guestId) {
        return guestService.deleteGuest(guestId);
    }
}
