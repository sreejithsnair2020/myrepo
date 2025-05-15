package interfacenew;

public class MultipleParent implements MultipleInterfaceOne,MultipleInterfaceTwo
{

	public static void main(String[] args) 
	{
MultipleParent obj=new MultipleParent();
obj.start();
obj.stop();
	}

	@Override
	public void stop() 
	{
		System.out.println("stop");
	}

	@Override
	public void start() 
	{
		System.out.println("start");
	}

}
