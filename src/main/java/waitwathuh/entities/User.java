package waitwathuh.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "users" )
public class User
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "user_id" )
	private long id;

	@NotNull
	private String username;

	@NotNull
	private String first_name;

	@NotNull
	private String last_name;

	@OneToMany( cascade = CascadeType.ALL )
	@JoinTable( name = "user_tasks", joinColumns = @JoinColumn( name = "user_id" ), inverseJoinColumns = @JoinColumn( name = "tasks_id" ) )
	private List< Task > user_tasks;

	public User()
	{

	}

	public User( String username, String fName, String lName )
	{
		this.username = username;
		this.first_name = fName;
		this.last_name = lName;
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
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

	public List< Task > getUser_tasks()
	{
		return user_tasks;
	}

	public void setUser_tasks( List< Task > user_tasks )
	{
		this.user_tasks = user_tasks;
	}
}