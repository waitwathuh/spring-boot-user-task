package waitwathuh.controllers.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import waitwathuh.services.iface.IDeleteTask;

@Controller
public class DeleteUserTask
{
	@Autowired
	private IDeleteTask deleteTask;

	@RequestMapping( value = "/api/user/{user_id}/task/{task_id}", method = RequestMethod.DELETE )
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteTask( @PathVariable("user_id") long user_id, @PathVariable("task_id") long task_id )
	{
		deleteTask.delete( user_id, task_id );
	}
}