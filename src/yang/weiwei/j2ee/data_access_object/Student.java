package yang.weiwei.j2ee.data_access_object;

public class Student
{
	private int rollNo;
	private String name;
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Student: [RollNo: "+rollNo+", Name: "+name+"]";
	}
	
	public Student(String name, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
}
