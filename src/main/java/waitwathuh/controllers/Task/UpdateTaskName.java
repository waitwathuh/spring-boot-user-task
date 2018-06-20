package waitwathuh.controllers.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import waitwathuh.model.request.UpdateTaskRequest;
import waitwathuh.services.iface.IUpdateTask;

@Controller
public class UpdateTaskName
{
	@Autowired
	private IUpdateTask updateTask;

	@RequestMapping( value = "/api/user/{user_id}/task/{task_id}", method = RequestMethod.PUT )
	@ResponseStatus( value = HttpStatus.NO_CONTENT )
	public void updateTask( @PathVariable( "user_id" ) int user_id, @PathVariable( "task_id" ) int task_id, @RequestBody UpdateTaskRequest model )
	{
		updateTask.update( user_id, task_id, model );
	}
}