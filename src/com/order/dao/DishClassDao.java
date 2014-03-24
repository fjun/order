package com.order.dao;

import java.util.List;

import com.order.pojos.DishClass;

public interface DishClassDao {
	void addDishClass(DishClass dishClass);

	void delDishClass(int id);
	
	void updateDishClass(DishClass dishClass);

	DishClass getDishClassById(int id);

	List<DishClass> getDishClass(int firstResult, int maxResult);
}
