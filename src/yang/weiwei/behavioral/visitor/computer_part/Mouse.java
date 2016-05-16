package yang.weiwei.behavioral.visitor.computer_part;

import yang.weiwei.behavioral.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart
{
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);
	}
}
