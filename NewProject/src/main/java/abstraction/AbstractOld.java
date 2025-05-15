package abstraction;

public class AbstractOld extends AbstractNew
{

	public static void main(String[] args)
	{
AbstractOld obj=new AbstractOld();
obj.show();
obj.stop();
obj.hello();
obj.start();
	}

	@Override
	public void show() {
	System.out.println("show");
		
	}

	@Override
	public void stop() {
	System.out.println("stop");
	}
		
	public void start()
	{
		System.out.println("start");
	}
	

}
