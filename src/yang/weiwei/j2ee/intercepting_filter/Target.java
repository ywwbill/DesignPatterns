package yang.weiwei.j2ee.intercepting_filter;

public class Target
{
	public void execute(String request)
	{
		System.out.println("Executing log: "+request);
	}
}
