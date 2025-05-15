package aggregation;

public class AggregationChild {
String place;
int pincode;
AggregationParent ref;
public AggregationChild(String place,int pincode,AggregationParent ref)
{
	this.place=place;
	this.pincode=pincode;
	this.ref=ref;
}
public void display()
{
	System.out.println(place);
	System.out.println(pincode);
	System.out.println(ref.name+ref.age);
}
	public static void main(String[] args) {
	AggregationParent obj=new AggregationParent("ASWIN\n",30);
	AggregationChild obj1=new AggregationChild("Kazhakkoottam",695582,obj);
	obj1.display();

	}

}
