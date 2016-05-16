package yang.weiwei.behavioral.visitor.computer_part;

import yang.weiwei.behavioral.visitor.ComputerPartVisitor;

public interface ComputerPart
{
	public void accept(ComputerPartVisitor computerPartVisitor);
}
