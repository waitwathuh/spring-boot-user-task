package waitwathuh.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import waitwathuh.entities.Task;
import waitwathuh.model.response.AllUserTasksResponse;

@Service
public class ListAllUserTasksFactory
{
	public List< AllUserTasksResponse > createResponse( List< Task > tasks )
	{
		List< AllUserTasksResponse > response = new ArrayList< AllUserTasksResponse >();

		for ( Task task : tasks )
		{
			response.add( new AllUserTasksResponse( task.getName(), task.getDescription(), task.getDate_time() ) );
		}

		return response;
	}
}