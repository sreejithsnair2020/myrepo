package inheritancefile;

public class SingleChild extends SingleParent {
public void printdetails()
{
	System.out.println("This is a childclass");
}
	public static void main(String[] args) {
	SingleChild obj=new SingleChild();
	obj.printdetails();
	obj.printinfo();
	
		// TODO Auto-generated method stub

	}

}
