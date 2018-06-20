package waitwathuh.dao.iface;

import waitwathuh.entities.Task;

public interface IGetTaskInfoDAO
{
	public Task getTaskInfo( long user_id, long task_id );
}