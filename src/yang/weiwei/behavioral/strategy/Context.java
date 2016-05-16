package yang.weiwei.behavioral.strategy;

public class Context
{
	private Strategy strategy;
	
	public int executeStrategy(int num1, int num2)
	{
		return strategy.doOperation(num1, num2);
	}
	
	public Context(Strategy strategy)
	{
		this.strategy=strategy;
	}
}
