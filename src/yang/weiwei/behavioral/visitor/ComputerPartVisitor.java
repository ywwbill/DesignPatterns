package yang.weiwei.behavioral.visitor;

import yang.weiwei.behavioral.visitor.computer_part.Computer;
import yang.weiwei.behavioral.visitor.computer_part.Keyboard;
import yang.weiwei.behavioral.visitor.computer_part.Monitor;
import yang.weiwei.behavioral.visitor.computer_part.Mouse;

public interface ComputerPartVisitor
{
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
