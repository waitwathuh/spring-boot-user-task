package waitwathuh.controllers.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import waitwathuh.model.request.UpdateUserRequest;
import waitwathuh.services.iface.IUpdateUser;

@Controller
public class Update
{
	@Autowired
	private IUpdateUser updateUser;

	@RequestMapping( value = "/api/user/{user_id}", method = RequestMethod.PUT )
	@ResponseStatus( value = HttpStatus.NO_CONTENT )
	public void updateUser( @PathVariable( "user_id" ) int user_id, @RequestBody UpdateUserRequest model )
	{
		updateUser.update( user_id, model );
	}
}