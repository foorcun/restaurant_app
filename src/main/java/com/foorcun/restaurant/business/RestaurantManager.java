package com.foorcun.restaurant.business;


import com.foorcun.restaurant.dataAccess.IRestaurantDal;
import com.foorcun.restaurant.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantManager implements IRestaurantService {


    public RestaurantManager(IRestaurantDal restaurantDal) {
        this.restaurantDal = restaurantDal;
    }

    @Autowired
    private IRestaurantDal restaurantDal;

    @Override
    public List<Restaurant> getAll() {
        return restaurantDal.getAll();
    }

    @Override
    public void add(Restaurant restaurant) {
        restaurantDal.add(restaurant);

    }

    @Override
    public void update(Restaurant restaurant) {
restaurantDal.update(restaurant);
    }

    @Override
    public void delete(Restaurant restaurant) {
        restaurantDal.delete(restaurant);

    }

    @Override
    public Restaurant getById(int id) {
        return restaurantDal.getById(id);
    }
}
