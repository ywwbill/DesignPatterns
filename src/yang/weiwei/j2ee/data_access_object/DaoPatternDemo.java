package yang.weiwei.j2ee.data_access_object;

public class DaoPatternDemo
{
	public static void main(String args[])
	{
		StudentDao studentDao=new StudentDaoImpl();
		
		for (Student student : studentDao.getAllStudents())
		{
			System.out.println(student);
		}
		
		Student student=studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		student=studentDao.getStudent(0);
		System.out.println(student);
	}
}
