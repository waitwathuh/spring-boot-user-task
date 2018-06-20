package waitwathuh.services.iface;

import waitwathuh.model.response.GetUserInfoResponse;

public interface IGetUserInfo
{
	public GetUserInfoResponse getUserInfo( long user_id );
}