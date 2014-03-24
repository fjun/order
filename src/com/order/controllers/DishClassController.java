package com.order.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.order.pojos.DishClass;
import com.order.service.DishClassManager;

/**
 * 
 * @author FJ
 *
 */
@Controller
@RequestMapping("/dishClass")
public class DishClassController {
	@Resource(name = "dishClassManager")
	private DishClassManager dishClassManager;
	
	@RequestMapping("/dish_class_list.do")
	public String getAllDishClass(HttpServletRequest request) {
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
		List<DishClass> dishClassList = dishClassManager.getDishClass(firstResult, maxResult);
		request.setAttribute("dishClassList", dishClassList);
		return "/dish_class_list";
	}
	
	@RequestMapping("/to_add_dish_class.do")
	public String toAddDishClass() {
		return "/dish_class_add";
	}
	
	@RequestMapping("/to_edit_dish_class.do")
	public String toEditDishClass(int id, HttpServletRequest request) {
		DishClass dishClass = dishClassManager.getDishClassById(id);
		request.setAttribute("dishClass", dishClass);
		return "/dish_class_edit";
	}
	
	@RequestMapping("/add_dish_class.do")
	public String addDishClass(DishClass dishClass, HttpServletRequest request) {
		dishClassManager.addDishClass(dishClass);
		return "redirect:/dishClass/dish_class_list.do";
	}
	
	@RequestMapping("/update_dish_class.do")
	public String updateDishClass(DishClass dishClass, HttpServletRequest request) {
		dishClassManager.updateDishClass(dishClass);
		return "redirect:/dishClass/dish_class_list.do";
	}
	
	@RequestMapping("/delete_dish_class.do")
	public String deleteDishClass(int id) {
		dishClassManager.delDishClass(id);
		return "redirect:/dishClass/dish_class_list.do";
	}
}
