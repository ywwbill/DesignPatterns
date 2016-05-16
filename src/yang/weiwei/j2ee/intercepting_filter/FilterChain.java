package yang.weiwei.j2ee.intercepting_filter;

import java.util.List;
import java.util.ArrayList;

public class FilterChain
{
	private List<Filter> filters=new ArrayList<Filter>();
	private Target target;
	
	public void addFilter(Filter filter)
	{
		filters.add(filter);
	}
	
	public void execute(String request)
	{
		for (Filter filter : filters)
		{
			filter.execute(request);
		}
		target.execute(request);
	}
	
	public void setTarget(Target target)
	{
		this.target=target;
	}
}
