package yang.weiwei.j2ee.business_delegate;

public class BusinessLookUp
{
	public BusinessService getBusinessService(String serviceType)
	{
		if (serviceType.equalsIgnoreCase("EJB"))
		{
			return new EJBService();
		}
		return new JMSService();
	}
}
