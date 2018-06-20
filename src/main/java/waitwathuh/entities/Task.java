package waitwathuh.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "tasks" )
public class Task
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "tasks_id" )
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String description;

	@NotNull
	private String date_time;

	@ManyToOne( cascade = CascadeType.ALL )
	@JoinTable( name = "user_tasks", joinColumns = @JoinColumn( name = "tasks_id" ), inverseJoinColumns = @JoinColumn( name = "user_id" ) )
	private User user;

	public Task()
	{

	}

	public Task( String name, String description, String date_time, User user )
	{
		this.name = name;
		this.description = description;
		this.date_time = date_time;
		this.user = user;
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
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

	public User getUser()
	{
		return user;
	}

	public void setUser( User user )
	{
		this.user = user;
	}
}