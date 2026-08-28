package day8;
import java.util.Scanner;
class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person p = new Person(age, name);
        p.show();
        sc.close();
    }
}
