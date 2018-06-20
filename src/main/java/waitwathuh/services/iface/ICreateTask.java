package waitwathuh.services.iface;

import waitwathuh.model.request.CreateTaskRequest;

public interface ICreateTask
{
	public void create( long user_id, CreateTaskRequest model );
}