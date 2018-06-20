package waitwathuh.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IListAllUserTasksDAO;
import waitwathuh.entities.Task;

@Repository
@Transactional
public class ListAllUserTasksDAO implements IListAllUserTasksDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public List< Task > listAllTasks( long user_id )
	{
		return ( List< Task > ) getSession().createQuery(
				"from Task where id = :user_id" )
				.setParameter( "user_id", user_id )
				.list();
	}
}