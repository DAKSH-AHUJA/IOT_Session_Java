package day2;
//This is example for super


class parent
{
   int a =10;
		   int b =20;
}

public class Demo2 extends parent {
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Demo2 jj = new Demo2();
	jj.add(2, 3);
	
}
}