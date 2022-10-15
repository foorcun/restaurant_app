package com.foorcun.restaurant.business;

import com.foorcun.restaurant.entity.Restaurant;

import java.util.List;

public interface IRestaurantService {

    List<Restaurant> getAll();

    void add(Restaurant restaurant);

    void update(Restaurant restaurant);

    void delete(Restaurant restaurant);

    Restaurant getById(int id);
}
