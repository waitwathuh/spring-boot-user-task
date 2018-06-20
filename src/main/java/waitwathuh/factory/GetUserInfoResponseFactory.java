package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.User;
import waitwathuh.model.response.GetUserInfoResponse;

@Service
public class GetUserInfoResponseFactory
{
	public GetUserInfoResponse createResponse( User user )
	{
		return new GetUserInfoResponse( user.getUsername(), user.getFirst_name(), user.getLast_name() );
	}
}