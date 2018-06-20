package waitwathuh.services.iface;

import waitwathuh.model.request.UpdateUserRequest;

public interface IUpdateUser
{
	public void update( long user_id, UpdateUserRequest model );
}