package com.order.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.order.dao.DishClassDao;
import com.order.pojos.DishClass;

public class DishClassDaoImpl extends HibernateDaoSupport implements
		DishClassDao {
    
	public void addDishClass(DishClass dishClass) {
		this.getHibernateTemplate().save(dishClass);
	}

	public void delDishClass(int id) {
		String hql = "delete DishClass d where d.id = :id";
		this.getSession().createQuery(hql).setInteger("id", id).executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<DishClass> getDishClass(final int firstResult,
			final int maxResult) {

		return getHibernateTemplate().executeFind(
				new HibernateCallback<List<DishClass>>() {

					public List<DishClass> doInHibernate(Session session)
							throws HibernateException, SQLException {
						return session.createQuery("from DishClass")
								.setFirstResult(firstResult).setMaxResults(
										maxResult).list();
					}
				});
	}

	public DishClass getDishClassById(int id) {
		return this.getHibernateTemplate().get(DishClass.class, id);
	}

	@Override
	public void updateDishClass(DishClass dishClass) {
		this.getHibernateTemplate().update(dishClass);
	}

}
