public class StaticInstanceDemo {

    static String collegeName; 
    String studentName;        

    static void setCollege(String name) {
        collegeName = name;
    }

    void setStudent(String name) {
        studentName = name;
    }

    void display() {
        System.out.println("College: " + collegeName);
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {

        setCollege("SIT Pune");

        StaticInstanceDemo obj = new StaticInstanceDemo();
        obj.setStudent("Sanika");

        obj.display();
    }
}
