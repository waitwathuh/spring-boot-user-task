package waitwathuh.services.iface;

import java.util.List;

import waitwathuh.model.response.AllUserTasksResponse;

public interface IListAllUserTasks
{
	public List< AllUserTasksResponse > listAllTasks( long user_id );
}