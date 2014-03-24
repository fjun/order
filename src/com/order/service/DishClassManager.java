package com.order.service;

import java.util.List;

import com.order.pojos.DishClass;

public interface DishClassManager {
	void addDishClass(DishClass dishClass);

	void updateDishClass(DishClass dishClass);
	
	void delDishClass(int id);

	DishClass getDishClassById(int id);

	List<DishClass> getDishClass(int firstResult, int maxResult);
}
