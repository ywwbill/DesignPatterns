package yang.weiwei.creational.singleton;

public class SingletonDemo
{
	public static void main(String[] args)
	{
//		Illegal
//		SingleObject object=new SingleObject();
		
		SingleObject object=SingleObject.getInstance();
		object.showMessage();
	}
}
