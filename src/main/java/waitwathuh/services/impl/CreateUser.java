package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.ICreateUserDAO;
import waitwathuh.entities.User;
import waitwathuh.factory.UserFactory;
import waitwathuh.model.request.CreateUserRequest;
import waitwathuh.services.iface.ICreateUser;

@Service
public class CreateUser implements ICreateUser
{
	@Autowired
	private ICreateUserDAO createUsersDAO;

	@Autowired
	private UserFactory userFactory;

	public void create( CreateUserRequest model )
	{
		User user = userFactory.createUser( model.getUsername(), model.getFirst_name(), model.getLast_name() );
		createUsersDAO.create( user );
	}
}