package yang.weiwei.behavioral.visitor;

import yang.weiwei.behavioral.visitor.computer_part.Computer;
import yang.weiwei.behavioral.visitor.computer_part.ComputerPart;

public class VisitorPatternDemo
{
	public static void main(String args[])
	{
		ComputerPart computer=new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
