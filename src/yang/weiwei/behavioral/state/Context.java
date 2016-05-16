package yang.weiwei.behavioral.state;

public class Context
{
	private State state;
	
	public void setState(State state)
	{
		this.state=state;
	}
	
	public State getState()
	{
		return state;
	}
	
	public Context()
	{
		state=null;
	}
}
