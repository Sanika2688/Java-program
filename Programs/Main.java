import java.util.Scanner;

class Student {
    String name;
    int roll;
    char division;

    Student(String name, int roll, char division) {
        this.name = name;
        this.roll = roll;
        this.division = division;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Division: " + division);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Division: ");
        char div = sc.next().charAt(0);

        Student s = new Student(name, roll, div);
        s.display();
    }
}
