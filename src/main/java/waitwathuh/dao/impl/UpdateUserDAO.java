package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IUpdateUserDAO;
import waitwathuh.entities.User;

@Repository
@Transactional
public class UpdateUserDAO implements IUpdateUserDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void update( User user )
	{
		getSession().update( user );
	}
}