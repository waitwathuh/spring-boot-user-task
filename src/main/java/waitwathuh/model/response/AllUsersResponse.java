package waitwathuh.model.response;

public class AllUsersResponse
{
	private long userId;
	private String username;
	private String first_name;
	private String last_name;

	public AllUsersResponse()
	{

	}

	public AllUsersResponse( long userId, String username, String fName, String lName )
	{
		this.userId = userId;
		this.username = username;
		this.first_name = fName;
		this.last_name = lName;
	}

	public long getUserId()
	{
		return userId;
	}

	public void setUserId( long userId )
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername( String username )
	{
		this.username = username;
	}

	public String getFirst_name()
	{
		return first_name;
	}

	public void setFirst_name( String first_name )
	{
		this.first_name = first_name;
	}

	public String getLast_name()
	{
		return last_name;
	}

	public void setLast_name( String last_name )
	{
		this.last_name = last_name;
	}
}