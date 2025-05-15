package inheritancefile;

public class SuperChild extends SuperParent{
public SuperChild()
{
	super(4,5);
	//this(2,3,4);
	System.out.println("This is child class");
}
public SuperChild(int a,int b,int c)
{
	super(3,4,5);
	System.out.println(a+ b+ c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperChild obj=new SuperChild(); 

//SuperParent obj1=new SuperParent(4,5);
//SuperParent obj2=new SuperParent(4,5.5f);
SuperChild obj3=new SuperChild(2,3,4);
	}

}
