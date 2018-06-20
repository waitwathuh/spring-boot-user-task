package waitwathuh.services.iface;

import java.util.List;

import waitwathuh.model.response.AllUsersResponse;

public interface IListAllUsers
{
	public List< AllUsersResponse > listAllUsers();
}