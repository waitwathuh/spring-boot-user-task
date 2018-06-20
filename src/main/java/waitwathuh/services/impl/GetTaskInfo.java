package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IGetTaskInfoDAO;
import waitwathuh.factory.GetTaskInfoResponseFactory;
import waitwathuh.model.response.GetTaskInfoResponse;
import waitwathuh.services.iface.IGetTaskInfo;

@Service
public class GetTaskInfo implements IGetTaskInfo
{
	@Autowired
	private IGetTaskInfoDAO getTaskInfoDAO;

	@Autowired
	private GetTaskInfoResponseFactory getTaskInfoResponseFactory;

	public GetTaskInfoResponse getTaskInfo( long user_id, long task_id )
	{
		return getTaskInfoResponseFactory.createResponse( getTaskInfoDAO.getTaskInfo( user_id, task_id ) );
	}
}