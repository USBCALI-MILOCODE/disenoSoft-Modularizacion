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

import com.airbnbmgmt.models.Host;
import com.airbnbmgmt.services.HostService;

@RestController
@RequestMapping("/airbnb/hosts")
public class HostController {
	@Autowired
    private HostService hostService;

    @PostMapping
    public boolean createHost(@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.getAllHosts();
    }

    @GetMapping("/{hostId}")
    public Host getHostById(@PathVariable int hostId) {
        return hostService.getHostById(hostId);
    }

    @PutMapping("/{hostId}")
    public boolean updateHost(@PathVariable int hostId, @RequestBody Host host) {
        return hostService.updateHost(hostId, host);
    }

    @DeleteMapping("/{hostId}")
    public boolean deleteHost(@PathVariable int hostId) {
        return hostService.deleteHost(hostId);
    }
}
