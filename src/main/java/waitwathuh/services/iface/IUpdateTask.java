package waitwathuh.services.iface;

import waitwathuh.model.request.UpdateTaskRequest;

public interface IUpdateTask
{
	public void update( long user_id, long task_id, UpdateTaskRequest model );
}