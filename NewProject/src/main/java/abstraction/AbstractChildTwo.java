package abstraction;

public class AbstractChildTwo extends AbstractParent
{

	public static void main(String[] args) 
	{
AbstractParent obj =new AbstractChildTwo();
obj.stop();
obj.hello();
//obj.hai();we cannot access the child class property by creating the parentclass refernce
	}

	@Override
	public void stop() 
	{
		System.out.println("Stop");
	}
public void hai()
{
	System.out.println("hai");
}
}
