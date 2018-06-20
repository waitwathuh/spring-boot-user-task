package waitwathuh.controllers.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import waitwathuh.model.response.AllUsersResponse;
import waitwathuh.services.iface.IListAllUsers;

@Controller
public class ListAll
{
	@Autowired
	private IListAllUsers listAllUsers;

	@RequestMapping( value = "/api/user", method = RequestMethod.GET )
	public @ResponseBody List< AllUsersResponse > listAllUsers()
	{
		return listAllUsers.listAllUsers();
	}
}