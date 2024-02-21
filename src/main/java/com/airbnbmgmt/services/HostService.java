package com.airbnbmgmt.services;

import java.util.List;

import com.airbnbmgmt.models.Host;

public interface HostService {
	boolean createHost(Host host);
    List<Host> getAllHosts();
    Host getHostById(int hostId);
    boolean updateHost(int hostId, Host host);
    boolean deleteHost(int hostId);
}
