package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.Task;
import waitwathuh.model.response.GetTaskInfoResponse;

@Service
public class GetTaskInfoResponseFactory
{
	public GetTaskInfoResponse createResponse( Task task )
	{
		return new GetTaskInfoResponse( task.getName(), task.getDescription(), task.getDate_time() );
	}
}