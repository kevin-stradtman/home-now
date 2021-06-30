package com.stradtkt.homenow.service;

import com.stradtkt.homenow.model.Home;

import java.util.List;

public interface HomeService {
    public List<Home> findAll();
    public void saveHome(Home home);
}
