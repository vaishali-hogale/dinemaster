package com.example.dinemaster.controller;

import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.model.Chef;
import com.example.dinemaster.service.RestaurantJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantJpaService restaurantJpaService;

    @GetMapping("/restaurants")
    public ArrayList<Restaurant> getRestaurants() {
        return restaurantJpaService.getRestaurants();
    }

    @GetMapping("/restaurants/{restaurantId}")

    public Restaurant getRestaurantById(@PathVariable("restaurantId") int restaurantId) {
        return restaurantJpaService.getRestaurantById(restaurantId);
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantJpaService.addRestaurant(restaurant);
    }

    @PutMapping("/restaurants/{restaurantId}")
    public Restaurant updateRestaurant(@PathVariable("restaurantId") int restaurantId,
            @RequestBody Restaurant restaurant) {
        return restaurantJpaService.updateRestaurant(restaurantId, restaurant);
    }

    @DeleteMapping("/restaurants/{restaurantId}")
    public void deleteRestaurnat(@PathVariable("restaurantId") int restaurantId) {
        restaurantJpaService.deleteRestaurant(restaurantId);
    }

}
