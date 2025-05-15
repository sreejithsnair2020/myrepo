package inheritancefile;

public class MultiChild extends MultiIntermediate{
public void childdetails()
{
	System.out.println("This is childclass");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChild obj=new MultiChild();
obj.childdetails();
obj.intermediate();
obj.parent();
	}

}
