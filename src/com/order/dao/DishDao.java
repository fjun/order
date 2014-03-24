package com.order.dao;

import java.util.List;

import com.order.pojos.Dish;

public interface DishDao {
	List<Dish> getDishList(int firstResult, int maxResult);
	void addDish(Dish dish);
}
