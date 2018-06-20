package waitwathuh.dao.iface;

import java.util.List;

import waitwathuh.entities.Task;

public interface IListAllUserTasksDAO
{
	public List< Task > listAllTasks( long user_id );
}