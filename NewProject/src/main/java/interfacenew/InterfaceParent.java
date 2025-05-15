package interfacenew;

public class InterfaceParent implements InterfaceChild
{

	public static void main(String[] args) 
	{
InterfaceChild obj=new InterfaceParent();
obj.hello();
obj.start();


InterfaceParent obj1 =new InterfaceParent();
//reference
obj1.stop();
	}

	@Override
	public void hello() 
	{
		System.out.println("hello");
		System.out.println(a);
		
	}

	@Override
	public void start() 
	{
		System.out.println("start");
	}
  public void stop()
  {
System.out.println("stop");
}
}
