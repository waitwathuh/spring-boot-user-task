package waitwathuh.controllers.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import waitwathuh.model.response.GetTaskInfoResponse;
import waitwathuh.services.iface.IGetTaskInfo;

@Controller
public class GetUserTaskInfo
{
	@Autowired
	private IGetTaskInfo getTaskInfo;

	@RequestMapping( value = "/api/user/{user_id}/task/{task_id}", method = RequestMethod.GET )
	public @ResponseBody GetTaskInfoResponse getTaskInfo( @PathVariable("user_id") long user_id, @PathVariable("task_id") long task_id )
	{
		return getTaskInfo.getTaskInfo( user_id, task_id );
	}
}