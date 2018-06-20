package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.ICreateUserDAO;
import waitwathuh.entities.User;

@Repository
@Transactional
public class CreateUserDAO implements ICreateUserDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void create( User user )
	{
		getSession().save( user );
	}
}