package yang.weiwei.j2ee.data_access_object;

import java.util.List;

public interface StudentDao
{
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
