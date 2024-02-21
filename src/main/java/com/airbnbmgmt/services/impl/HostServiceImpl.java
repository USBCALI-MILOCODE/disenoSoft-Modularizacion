package com.airbnbmgmt.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.airbnbmgmt.models.Host;
import com.airbnbmgmt.services.HostService;

@Service
public class HostServiceImpl implements HostService {
	
	private final Map<Integer, Host> hosts = new HashMap<>();
    private int hostIdCounter = 0;

    @Override
    public boolean createHost(Host host) {
        host.setHostId(++hostIdCounter);
        hosts.put(host.getHostId(), host);
        return true;
    }

    @Override
    public List<Host> getAllHosts() {
        return new ArrayList<>(hosts.values());
    }

    @Override
    public Host getHostById(int hostId) {
        return hosts.get(hostId);
    }

    @Override
    public boolean updateHost(int hostId, Host host) {
        if (!hosts.containsKey(hostId)) {
            return false;
        }
        host.setHostId(hostId);
        hosts.put(hostId, host);
        return true;
    }

    @Override
    public boolean deleteHost(int hostId) {
        return hosts.remove(hostId) != null;
    }
}
