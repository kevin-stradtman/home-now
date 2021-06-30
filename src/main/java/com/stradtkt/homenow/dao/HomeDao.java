package com.stradtkt.homenow.dao;

import com.stradtkt.homenow.model.Home;

import java.util.List;

public interface HomeDao {
    public void saveHome(Home home);

    List<Home> findAll();
}
