package yang.weiwei.j2ee.front_controller;

public class Dispatcher
{
	private StudentView studentView;
	private HomeView homeView;
	
	public void dispatch(String request)
	{
		if (request.equalsIgnoreCase("STUDENT"))
		{
			studentView.show();
		}
		else
		{
			homeView.show();
		}
	}
	
	public Dispatcher()
	{
		studentView=new StudentView();
		homeView=new HomeView();
	}
}
