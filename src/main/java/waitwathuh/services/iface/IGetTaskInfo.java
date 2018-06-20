package waitwathuh.services.iface;

import waitwathuh.model.response.GetTaskInfoResponse;

public interface IGetTaskInfo
{
	public GetTaskInfoResponse getTaskInfo( long user_id, long task_id );
}