package waitwathuh.controllers.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import waitwathuh.model.request.CreateTaskRequest;
import waitwathuh.services.iface.ICreateTask;

@Controller
public class CreateNewTask
{
	@Autowired
	private ICreateTask createTask;

	@RequestMapping( value = "/api/user/{user_id}/task", method = RequestMethod.POST )
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void createTask( @PathVariable("user_id") long user_id, @RequestBody CreateTaskRequest model )
	{
		createTask.create( user_id, model );
	}
}