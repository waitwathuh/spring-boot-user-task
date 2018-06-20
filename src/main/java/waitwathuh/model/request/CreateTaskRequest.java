package waitwathuh.model.request;

public class CreateTaskRequest
{
	private String name;
	private String description;
	private String date_time;

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