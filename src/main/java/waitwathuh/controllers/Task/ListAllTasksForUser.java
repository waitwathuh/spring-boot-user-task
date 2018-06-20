package waitwathuh.controllers.Task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import waitwathuh.model.response.AllUserTasksResponse;
import waitwathuh.services.iface.IListAllUserTasks;

@Controller
public class ListAllTasksForUser
{
	@Autowired
	private IListAllUserTasks listAllUserTasks;

	@RequestMapping( value = "/api/user/{user_id}/task", method = RequestMethod.GET )
	public @ResponseBody List< AllUserTasksResponse > listAllUserTasks( @PathVariable("user_id") long user_id )
	{
		return listAllUserTasks.listAllTasks( user_id );
	}
}