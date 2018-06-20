package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IUpdateTaskDAO;
import waitwathuh.entities.Task;

@Repository
@Transactional
public class UpdateTaskDAO implements IUpdateTaskDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void update( Task task )
	{
		getSession().update( task );
	}
}