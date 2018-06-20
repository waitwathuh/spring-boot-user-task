package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IGetTaskInfoDAO;
import waitwathuh.entities.Task;

@Repository
@Transactional
public class GetTaskInfoDAO implements IGetTaskInfoDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public Task getTaskInfo( long user_id, long task_id )
	{
		return ( Task ) getSession().createQuery(
		        "from Task where id = :task_id and user.id = :user_id" )
		        .setParameter( "task_id", task_id )
		        .setParameter( "user_id", user_id )
		        .uniqueResult();
	}
}