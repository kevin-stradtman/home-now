package com.stradtkt.homenow.dao;

import com.stradtkt.homenow.model.Home;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HomeDaoImpl implements HomeDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void saveHome(Home home) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(home);
    }

    @Override
    public List<Home> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Home> query = session.createQuery("from Home order by city", Home.class);
        List<Home> homes = query.getResultList();
        return homes;
    }
}
