package yang.weiwei.j2ee.transfer_object;

public class StudentVO
{
	private String name;
	private int rollNo;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public String toString()
	{
		return "Student: [RollNo: "+rollNo+", Name: "+name+"]";
	}
	
	public StudentVO(String name, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
}
