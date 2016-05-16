package yang.weiwei.structural.proxy;

public class RealImage implements Image
{
	private String fileName;
	
	public RealImage(String fileName)
	{
		this.fileName=fileName;
		loadFromDisc(fileName);
	}
	
	@Override
	public void display()
	{
		System.out.println("Displaying "+fileName);
	}
	
	private void loadFromDisc(String fileName)
	{
		System.out.println("Loading "+fileName);
	}
}
