package waitwathuh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waitwathuh.dao.iface.IGetUserInfoDAO;
import waitwathuh.entities.User;

@Repository
@Transactional
public class GetUserInfoDAO implements IGetUserInfoDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public User getUserInfo( long userId )
	{
		return ( User ) getSession().createQuery(
		        "from User where id = :user_id" )
		        .setParameter( "user_id", userId )
		        .uniqueResult();
	}
}