package yang.weiwei.structural.filter_criteria;

public class Person
{
	private String name;
	private String gender;
	private String martialStatus;
	
	public Person(String name, String gender, String martialStatus)
	{
		this.name=name;
		this.gender=gender;
		this.martialStatus=martialStatus;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getMartialStatus()
	{
		return martialStatus;
	}
	
	public String toString()
	{
		return "Person: [Name: "+name+", Gender: "+gender+", Martial Status: "+martialStatus+"]";
	}
}
