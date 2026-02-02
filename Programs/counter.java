class Student {
    static String commonRollPart = "2025CS";
    static int counter = 0;

    String name;
    String finalRoll;

    Student(String name) {
        this.name = name;
        counter++;
        this.finalRoll = commonRollPart + counter;
    }

    void display() {
        System.out.println("Name: " + name + " | Roll No: " + finalRoll);
    }
}

public class counter {
    public static void main(String[] args) {
        Student s1 = new Student("Sanika");
        Student s2 = new Student("Rohan");
        Student s3 = new Student("Meera");

        s1.display();
        s2.display();
        s3.display();
    }
}
