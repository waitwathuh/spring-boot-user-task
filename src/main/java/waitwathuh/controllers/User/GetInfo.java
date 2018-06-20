package waitwathuh.controllers.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import waitwathuh.model.response.GetUserInfoResponse;
import waitwathuh.services.iface.IGetUserInfo;

@Controller
public class GetInfo
{
	@Autowired
	private IGetUserInfo createUser;

	@RequestMapping( value = "/api/user/{user_id}", method = RequestMethod.GET )
	public @ResponseBody GetUserInfoResponse getUserInfo( @PathVariable("user_id") long user_id )
	{
		return createUser.getUserInfo( user_id );
	}
}