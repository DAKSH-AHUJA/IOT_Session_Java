package day2;


class GrandParent
{
	void bp() {
		System.out.println("Understrain bp");
	}
}

class Parent2 extends GrandParent
{
	void cancer() 
	{
		System.out.println("understrain");
	}
}


public class inheritance extends GrandParent {

	public static void main(String[] args) {
		
		inheritance obj = new inheritance();
		obj.bp();
		Parent2 obj1 = new Parent2();
		obj1.cancer();
		
		
		
	}
}
