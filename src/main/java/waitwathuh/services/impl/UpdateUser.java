package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IGetUserInfoDAO;
import waitwathuh.dao.iface.IUpdateUserDAO;
import waitwathuh.entities.User;
import waitwathuh.factory.UpdateUserFactory;
import waitwathuh.model.request.UpdateUserRequest;
import waitwathuh.services.iface.IUpdateUser;

@Service
public class UpdateUser implements IUpdateUser
{
	@Autowired
	private IGetUserInfoDAO getUserInfoDAO;

	@Autowired
	private IUpdateUserDAO updateUserDAO;

	@Autowired
	private UpdateUserFactory updateUserFactory;

	public void update( long user_id, UpdateUserRequest model )
	{
		User user = getUserInfoDAO.getUserInfo( user_id );
		user = updateUserFactory.updateUser( user, model.getFirst_name(), model.getLast_name() );
		updateUserDAO.update( user );
	}
}