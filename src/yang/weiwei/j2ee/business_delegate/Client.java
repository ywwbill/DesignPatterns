package yang.weiwei.j2ee.business_delegate;

public class Client
{
	BusinessDelegate businessService;
	
	public void doTask()
	{
		businessService.doTask();
	}
	
	public Client(BusinessDelegate businessService)
	{
		this.businessService=businessService;
	}
}
