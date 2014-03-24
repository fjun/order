package com.order.service;

import java.util.List;

import com.order.pojos.Dish;

public interface DishManager {
	List<Dish> getDishList(int firstResult, int maxResult);
	void addDish(Dish dish);
}
