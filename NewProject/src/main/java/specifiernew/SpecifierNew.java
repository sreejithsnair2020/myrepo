package specifiernew;

import accessspecifier.AccessNew;

public class SpecifierNew extends AccessNew {

	public static void main(String[] args) {
	SpecifierNew obj=new SpecifierNew();
	obj.promethod();
	obj.pubmethod();
	//obj.defmethod(); it cannot be accessed outside the package
	//obj.primethod(); it cannot be accessed outside the class
	}

}
