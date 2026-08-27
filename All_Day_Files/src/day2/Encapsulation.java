package day2;

//This concept is called encapsulation with getter setter method


class Parent1{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}


public class Encapsulation extends Parent1{
	
	public static void main(String[] args) {
		
		Encapsulation test = new Encapsulation();
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
		
}
