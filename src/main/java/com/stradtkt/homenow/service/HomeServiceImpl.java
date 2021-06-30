package com.stradtkt.homenow.service;

import com.stradtkt.homenow.dao.HomeDao;
import com.stradtkt.homenow.model.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeDao homeDao;

    @Override
    public List<Home> findAll() {
        return homeDao.findAll();
    }

    @Override
    @Transactional
    public void saveHome(Home home) {
        homeDao.saveHome(home);
    }
}
