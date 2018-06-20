package waitwathuh.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IListAllUsersDAO;
import waitwathuh.factory.ListAllUsersFactory;
import waitwathuh.model.response.AllUsersResponse;
import waitwathuh.services.iface.IListAllUsers;

@Service
public class ListAllUsers implements IListAllUsers
{
	@Autowired
	private IListAllUsersDAO listAllUsersDAO;

	@Autowired
	private ListAllUsersFactory listAllUsersFactory;

	public List< AllUsersResponse > listAllUsers()
	{
		return listAllUsersFactory.createResponse( listAllUsersDAO.listAllUsers() );
	}
}