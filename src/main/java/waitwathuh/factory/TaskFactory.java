package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.Task;
import waitwathuh.entities.User;

@Service
public class TaskFactory
{
	public Task createTask( User user, String name, String description, String date_time )
	{
		return new Task( name, description, date_time, user );
	}
}