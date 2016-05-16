package yang.weiwei.j2ee.transfer_object;

public class TransferObjectPatternDemo
{
	public static void main(String args[])
	{
		StudentBO studentBusinessObject=new StudentBO();
		
		for (StudentVO student : studentBusinessObject.getAllStudents())
		{
			System.out.println(student);
		}
		
		StudentVO student=studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		student=studentBusinessObject.getStudent(0);
		System.out.println(student);
	}
}
