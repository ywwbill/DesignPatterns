package yang.weiwei.j2ee.transfer_object;

import java.util.List;
import java.util.ArrayList;

public class StudentBO
{
	List<StudentVO> students;
	
	public void deleteStudent(StudentVO student)
	{
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No "+student.getRollNo()+", deleted from database.");
	}
	
	public List<StudentVO> getAllStudents()
	{
		return students;
	}
	
	public StudentVO getStudent(int rollNo)
	{
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentVO student)
	{
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No "+student.getRollNo()+", updated from database.");
	}
	
	public StudentBO()
	{
		students=new ArrayList<StudentVO>();
		students.add(new StudentVO("Robert", 0));
		students.add(new StudentVO("John", 1));
	}
}
