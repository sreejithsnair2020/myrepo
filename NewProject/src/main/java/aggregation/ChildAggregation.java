package aggregation;

public class ChildAggregation {
	String subject;
	int rollnumber;
	ParentAggregation ref;
	public ChildAggregation(String subject,int rollnumber,ParentAggregation ref)
	{
		this.subject=subject;
		this.rollnumber=rollnumber;
		this.ref=ref;
	}
public void printdetails()
{
	System.out.println(subject);
	System.out.println(rollnumber);
	System.out.println(ref.name+ref.mark);
}
	public static void main(String[] args) {
		ParentAggregation obj=new ParentAggregation("kiran",25);
		
	ChildAggregation obj1=new ChildAggregation("MATHS",23,obj);
	obj1.printdetails();
    

	}

}
