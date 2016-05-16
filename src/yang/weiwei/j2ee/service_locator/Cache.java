package yang.weiwei.j2ee.service_locator;

import java.util.List;
import java.util.ArrayList;

public class Cache
{
	private List<Service> services;
	
	public Service getService(String serviceName)
	{
		for (Service service : services)
		{
			if (service.getName().equalsIgnoreCase(serviceName))
			{
				System.out.println("Returning cached "+serviceName+" object");
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service newService)
	{
		for (Service service : services)
		{
			if (service.getName().equalsIgnoreCase(newService.getName()))
			{
				return;
			}
		}
		services.add(newService);
	}
	
	public Cache()
	{
		services=new ArrayList<Service>();
	}
}
