public class studentName {
    int id;
    String name;

    public static void main(String[] args) {

        studentName s1 = new studentName();
        s1.id = 101;
        s1.name = "Sanika";

        studentName s2 = new studentName();
        s2.id = 102;
        s2.name = "Chakchi";

        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student ID: " + s2.id);
        System.out.println("Student Name: " + s2.name);
    }
}