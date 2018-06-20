package waitwathuh.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import waitwathuh.entities.User;
import waitwathuh.model.response.AllUsersResponse;

@Service
public class ListAllUsersFactory
{
	public List< AllUsersResponse > createResponse( List< User > users )
	{
		List< AllUsersResponse > response = new ArrayList< AllUsersResponse >();

		for ( User user : users )
		{
			response.add( new AllUsersResponse( user.getId(), user.getUsername(), user.getFirst_name(), user.getLast_name() ) );
		}

		return response;
	}
}