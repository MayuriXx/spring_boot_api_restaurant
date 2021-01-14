package com.formation.restaurant.controlers;

import com.formation.restaurant.data.models.Restaurant;
import com.formation.restaurant.exceptions.ResourceNotFoundException;
import com.formation.restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> findAll() {
        return restaurantService.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant findById(@PathVariable("id") String id){
        Restaurant response = restaurantService.findById(id);
        if(response == null){
            throw new ResourceNotFoundException();
        }
        return response;
    }
}
