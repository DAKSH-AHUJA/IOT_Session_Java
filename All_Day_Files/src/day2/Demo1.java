package day2;

//Hierarchical Inheritance

public class Demo1 {

public Demo1() {
	System.out.println("HEllo world");
}

public Demo1(int a) {
	System.out.println("HEllo world contr" );

}

public static void main(String[] args) {
	Demo1 obj = new Demo1();
	Demo1 obj2 = new Demo1(3);
}
	
}
