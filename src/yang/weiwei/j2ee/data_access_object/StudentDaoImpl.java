package yang.weiwei.j2ee.data_access_object;

import java.util.List;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao
{
	List<Student> students;
	
	@Override
	public List<Student> getAllStudents()
	{
		return students;
	}

	@Override
	public Student getStudent(int rollNo)
	{
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student)
	{
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No "+student.getRollNo()+", updated in the database.");
	}

	@Override
	public void deleteStudent(Student student)
	{
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No "+student.getRollNo()+", deleted in the database.");
	}

	public StudentDaoImpl()
	{
		students=new ArrayList<Student>();
		students.add(new Student("Robert", 0));
		students.add(new Student("John", 1));
	}
}
