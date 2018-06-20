package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.User;

@Service
public class UpdateUserFactory
{
	public User updateUser( User user, String fName, String lName )
	{
		user.setFirst_name( fName );
		user.setLast_name( lName );
		return user;
	}
}