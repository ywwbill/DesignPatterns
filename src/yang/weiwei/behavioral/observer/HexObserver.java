package yang.weiwei.behavioral.observer;

public class HexObserver extends Observer
{
	@Override
	public void update()
	{
		System.out.println("Hex String: "+Integer.toHexString(subject.getState()).toUpperCase());
	}
	
	public HexObserver(Subject subject)
	{
		this.subject=subject;
		this.subject.attach(this);
	}
}
