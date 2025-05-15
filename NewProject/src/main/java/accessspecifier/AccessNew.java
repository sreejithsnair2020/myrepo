package accessspecifier;

public class AccessNew {

	public void pubmethod()
	{
		System.out.println("This is a public method");
	}
	private void primethod()
	{
		System.out.println("This is a private method");
	}
	protected void promethod()
	{
		System.out.println("This is a protected method");
	}
	void demethod()
	{
		System.out.println("This is default");
	}
	public static void main(String[] args) {
	AccessNew obj=new AccessNew();
	obj.pubmethod();
	obj.primethod();
	obj.promethod();
	obj.demethod();
	

	}

}
