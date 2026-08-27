package day1;

import java.util.Scanner;

public class ProjectLoop {

    // 1) create 2) display 3) raise sal 4) exit
    // Loop continues if user enters 'y' (yes), stops if 'n' (no)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        String designation = "";
        double salary = 0;

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Sal");
            System.out.println("4) Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // 1)enter the name
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    // 2)enter the age
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    // 3)enter the designation (PMT)
                    System.out.print("Enter designation (e.g., PMT): ");
                    designation = sc.nextLine();

                    // Optional: initial salary (needed for Raise Sal)
                    System.out.print("Enter current salary: ");
                    salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Employee created successfully!");
                    break;

                case 2:
                    // display
                    if (name.isEmpty()) {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    } else {
                        System.out.println("\n--- Employee Details ---");
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Designation: " + designation);
                        System.out.println("Salary: " + salary);
                    }
                    break;

                case 3:
                    // raise sal
                    if (name.isEmpty()) {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    } else {
                        System.out.print("Enter raise amount (e.g., 5000): ");
                        double raise = sc.nextDouble();
                        sc.nextLine();
                        salary += raise;
                        System.out.println("Salary raised successfully! New salary = " + salary);
                    }
                    break;

                case 4:
                    // exit immediately
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }

            // After enter yes or no (y/n)
            System.out.print("\nContinue? (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();

            if (ans.equals("n")) {
                System.out.println("Stopped.");
                break;
            } else if (!ans.equals("y")) {
                System.out.println("Invalid input. Stopping.");
                break;
            }
            // if yes, loop repeats to show menu again
        }

        sc.close();
    }
}
