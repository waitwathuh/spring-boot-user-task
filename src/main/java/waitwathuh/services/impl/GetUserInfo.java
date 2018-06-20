package waitwathuh.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waitwathuh.dao.iface.IGetUserInfoDAO;
import waitwathuh.factory.GetUserInfoResponseFactory;
import waitwathuh.model.response.GetUserInfoResponse;
import waitwathuh.services.iface.IGetUserInfo;

@Service
public class GetUserInfo implements IGetUserInfo
{
	@Autowired
	private IGetUserInfoDAO getUserInfoDAO;

	@Autowired
	private GetUserInfoResponseFactory getUserInfoResponseFactory;

	public GetUserInfoResponse getUserInfo( long user_id )
	{
		return getUserInfoResponseFactory.createResponse( getUserInfoDAO.getUserInfo( user_id ) );
	}
}