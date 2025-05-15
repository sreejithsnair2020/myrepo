package inheritancefile;

public class ChildOne extends ParentOne {
	public void printdetails()
	{
		System.out.println("This is child one");
	}

	public static void main(String[] args) {
		ChildOne obj=new ChildOne();
		obj.printdetails();
		obj.parentinfo();
		// TODO Auto-generated method stub

	}

}
