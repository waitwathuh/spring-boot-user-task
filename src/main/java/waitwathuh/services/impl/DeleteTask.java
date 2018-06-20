package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IDeleteTaskDAO;
import waitwathuh.dao.iface.IGetTaskInfoDAO;
import waitwathuh.services.iface.IDeleteTask;

@Service
public class DeleteTask implements IDeleteTask
{
	@Autowired
	private IDeleteTaskDAO deleteDAO;

	@Autowired
	private IGetTaskInfoDAO getTaskInfoDAO;

	public void delete( long user_id, long task_id )
	{
		deleteDAO.delete( getTaskInfoDAO.getTaskInfo( user_id, task_id ) );
	}
}