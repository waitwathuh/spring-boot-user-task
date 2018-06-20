package waitwathuh.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IListAllUsersDAO;
import waitwathuh.entities.User;

@Repository
@Transactional
public class ListAllUsersDAO implements IListAllUsersDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public List< User > listAllUsers()
	{
		return getSession().createQuery("from User").list();
	}
}