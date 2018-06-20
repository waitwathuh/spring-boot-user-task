package waitwathuh.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IListAllUserTasksDAO;
import waitwathuh.factory.ListAllUserTasksFactory;
import waitwathuh.model.response.AllUserTasksResponse;
import waitwathuh.services.iface.IListAllUserTasks;

@Service
public class ListAllUserTasks implements IListAllUserTasks
{
	@Autowired
	private IListAllUserTasksDAO listAllUserTasksDAO;

	@Autowired
	private ListAllUserTasksFactory listAllUserTasksFactory;

	public List< AllUserTasksResponse > listAllTasks( long user_id )
	{
		return listAllUserTasksFactory.createResponse( listAllUserTasksDAO.listAllTasks( user_id ) );
	}
}