package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.User;

@Service
public class UserFactory
{
	public User createUser( String username, String fName, String lName )
	{
		return new User( username, fName, lName );
	}
}