package com.foorcun.restaurant.dataAccess;


import com.foorcun.restaurant.entity.Restaurant;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MySqlRestaurantDal implements IRestaurantDal{

    private EntityManager  entityManager;

    public MySqlRestaurantDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<Restaurant> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Restaurant> restaurants = session.createQuery("from Restaurant", Restaurant.class).getResultList();
        return restaurants;

    }

    @Override
    @Transactional
    public void add(Restaurant restaurant) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(restaurant);

    }

    @Override
    @Transactional

    public void update(Restaurant restaurant) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(restaurant);

    }

    @Override
    @Transactional

    public void delete(Restaurant restaurant) {
        Session session = entityManager.unwrap(Session.class);
        Restaurant restaurantToDelete = session.get(Restaurant.class, restaurant.getId());
        session.delete(restaurantToDelete);

    }

    @Override
    @Transactional

    public Restaurant getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Restaurant restaurant = session.get(Restaurant.class, id);
        return restaurant;

    }
}
