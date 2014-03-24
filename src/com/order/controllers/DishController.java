package com.order.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.order.pojos.Dish;
import com.order.service.DishManager;

@Controller
@RequestMapping("/dish")
public class DishController {
	@Resource(name = "dishManager")
	private DishManager dishManager;
	
	@RequestMapping("/dish_list.do")
	public String getAllDish(HttpServletRequest request) {
		int firstResult = 0;
		try {
			firstResult = Integer.parseInt(request.getParameter("page"));
		} catch (NumberFormatException e) {
			firstResult = 0;
		}
		int maxResult = 0;
		try {
			maxResult = Integer.parseInt(request.getParameter("pageSize"));
		} catch (NumberFormatException e) {
			maxResult = 15;
		}
		
		List<Dish> dishList = dishManager.getDishList(firstResult, maxResult);
		request.setAttribute("dishList", dishList);
		return "/dish_list";
	}
	
	@RequestMapping("/to_add_dish")
	public String toAddDish() {
		return "/dish_add";
	}
	
	@RequestMapping("/add_dish.do")
	public String addDish(Dish dish) {
		dishManager.addDish(dish);
		return "redirect:/dish_list.do";
	}
}
