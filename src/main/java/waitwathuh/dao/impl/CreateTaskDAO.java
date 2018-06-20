package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.ICreateTaskDAO;
import waitwathuh.entities.Task;

@Repository
@Transactional
public class CreateTaskDAO implements ICreateTaskDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void create( Task task )
	{
		getSession().save( task );
	}
}