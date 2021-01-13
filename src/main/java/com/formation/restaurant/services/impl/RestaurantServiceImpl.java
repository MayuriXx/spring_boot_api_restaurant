package com.formation.restaurant.services.impl;

import com.formation.restaurant.models.Restaurant;
import com.formation.restaurant.services.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> list = new ArrayList<Restaurant>();
        Restaurant r1 = new Restaurant();
        r1.setId("1");
        r1.setName("test1");
        r1.setAddress("test1 address");
        list.add(r1);
        Restaurant r2 = new Restaurant();
        r2.setId("2");
        r2.setName("test2");
        r2.setAddress("test2 address");
        list.add(r2);
        return list;
    }
}
