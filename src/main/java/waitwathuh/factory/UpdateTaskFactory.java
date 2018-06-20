package waitwathuh.factory;

import org.springframework.stereotype.Service;

import waitwathuh.entities.Task;

@Service
public class UpdateTaskFactory
{
	public Task updateTask( Task task, String name )
	{
		task.setName( name );
		return task;
	}
}