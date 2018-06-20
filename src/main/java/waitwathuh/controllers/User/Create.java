package waitwathuh.controllers.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import waitwathuh.model.request.CreateUserRequest;
import waitwathuh.services.iface.ICreateUser;

@Controller
public class Create
{
	@Autowired
	private ICreateUser createUser;

	@RequestMapping( value = "/api/user", method = RequestMethod.POST )
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void createUser( @RequestBody CreateUserRequest model )
	{
		createUser.create( model );
	}
}