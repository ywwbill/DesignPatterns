package yang.weiwei.j2ee.intercepting_filter;

public class DebugFilter implements Filter
{
	@Override
	public void execute(String request)
	{
		System.out.println("Request log: "+request);
	}
}
