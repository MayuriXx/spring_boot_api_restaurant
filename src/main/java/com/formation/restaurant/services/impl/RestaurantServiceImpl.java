package com.formation.restaurant.services.impl;

import com.formation.restaurant.data.dao.RestaurantRepository;
import com.formation.restaurant.data.models.Restaurant;
import com.formation.restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> list = new ArrayList<Restaurant>();
        restaurantRepository.findAll().forEach(list::add);
        return list;
    }
}
