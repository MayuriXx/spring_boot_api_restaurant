package com.formation.restaurant.data.dao;

import com.formation.restaurant.data.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, String> {
}
