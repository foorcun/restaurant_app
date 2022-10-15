package com.foorcun.restaurant.restApi;

import com.foorcun.restaurant.business.IRestaurantService;
import com.foorcun.restaurant.entity.Restaurant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestaurantContoller {

    private IRestaurantService restaurantManager;

    public RestaurantContoller(IRestaurantService restaurantManager) {
        this.restaurantManager = restaurantManager;
    }

    @GetMapping("/restaurants")
    public List<Restaurant> getAll() {
        return restaurantManager.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Restaurant restaurant) {
        restaurantManager.add(restaurant);
    }


    @PostMapping("/update")
    public void update(@RequestBody Restaurant restaurant) {
        restaurantManager.update(restaurant);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Restaurant restaurant) {
        restaurantManager.delete(restaurant);
    }


    @GetMapping("/restaurants/{id}")
    public Restaurant getById(@PathVariable int id ){
        return restaurantManager.getById(id);
    }


}
