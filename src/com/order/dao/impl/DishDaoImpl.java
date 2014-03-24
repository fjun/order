package com.order.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.order.dao.DishDao;
import com.order.pojos.Dish;

public class DishDaoImpl extends HibernateDaoSupport implements DishDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Dish> getDishList(final int firstResult, final int maxResult) {
		return getHibernateTemplate().executeFind(new HibernateCallback<List<Dish>>() {
			@Override
			public List<Dish> doInHibernate(Session session)
					throws HibernateException, SQLException {
				return session.createQuery("fron Dish")
						.setFirstResult(firstResult).setMaxResults(maxResult)
						.list();
			}
		});
	}

	@Override
	public void addDish(Dish dish) {
		getHibernateTemplate().save(dish);
	}

}
