package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IGetTaskInfoDAO;
import waitwathuh.dao.iface.IUpdateTaskDAO;
import waitwathuh.entities.Task;
import waitwathuh.factory.UpdateTaskFactory;
import waitwathuh.model.request.UpdateTaskRequest;
import waitwathuh.services.iface.IUpdateTask;

@Service
public class UpdateTask implements IUpdateTask
{
	@Autowired
	private IGetTaskInfoDAO getTaskInfoDAO;

	@Autowired
	private IUpdateTaskDAO updateTaskDAO;

	@Autowired
	private UpdateTaskFactory updateTaskFactory;

	public void update( long user_id, long task_id, UpdateTaskRequest model )
	{
		Task task = getTaskInfoDAO.getTaskInfo( user_id, task_id );
		task = updateTaskFactory.updateTask( task, model.getName() );
		updateTaskDAO.update( task );
	}
}