package yang.weiwei.j2ee.intercepting_filter;

public class FilterManager
{
	FilterChain filterChain;
	
	public void setFilter(Filter filter)
	{
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request)
	{
		filterChain.execute(request);
	}
	
	public FilterManager(Target target)
	{
		filterChain=new FilterChain();
		filterChain.setTarget(target);
	}
}
