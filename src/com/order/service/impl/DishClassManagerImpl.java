package com.order.service.impl;

import java.util.List;

import com.order.dao.DishClassDao;
import com.order.pojos.DishClass;
import com.order.service.DishClassManager;

public class DishClassManagerImpl implements DishClassManager {

	private DishClassDao dishClassDao;
	public void setDishClassDao(DishClassDao dishClassDao) {
		this.dishClassDao = dishClassDao;
	}
	
	public void addDishClass(DishClass dishClass) {
		dishClassDao.addDishClass(dishClass);
	}

	public void delDishClass(int id) {
		dishClassDao.delDishClass(id);
	}

	public List<DishClass> getDishClass(int firstResult, int maxResult) {
		return dishClassDao.getDishClass(firstResult, maxResult);
	}

	public DishClass getDishClassById(int id) {
		return dishClassDao.getDishClassById(id);
	}

	@Override
	public void updateDishClass(DishClass dishClass) {
		dishClassDao.updateDishClass(dishClass);
	}

}
