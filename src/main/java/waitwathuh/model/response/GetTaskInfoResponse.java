package waitwathuh.model.response;

public class GetTaskInfoResponse
{
	private String name;
	private String description;
	private String date_time;

	public GetTaskInfoResponse()
	{

	}

	public GetTaskInfoResponse( String name, String description, String date_time )
	{
		this.name = name;
		this.description = description;
		this.date_time = date_time;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public String getDate_time()
	{
		return date_time;
	}

	public void setDate_time( String date_time )
	{
		this.date_time = date_time;
	}
}