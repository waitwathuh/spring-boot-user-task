package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.ICreateTaskDAO;
import waitwathuh.dao.iface.IGetUserInfoDAO;
import waitwathuh.entities.Task;
import waitwathuh.factory.TaskFactory;
import waitwathuh.model.request.CreateTaskRequest;
import waitwathuh.services.iface.ICreateTask;

@Service
public class CreateTask implements ICreateTask
{
	@Autowired
	private IGetUserInfoDAO getUserInfoDAO;

	@Autowired
	private ICreateTaskDAO createTaskDAO;

	@Autowired
	private TaskFactory taskFactory;

	public void create( long user_id, CreateTaskRequest model )
	{
		Task task = taskFactory.createTask( getUserInfoDAO.getUserInfo( user_id ), model.getName(), model.getDescription(), model.getDate_time() );
		createTaskDAO.create( task );
	}
}