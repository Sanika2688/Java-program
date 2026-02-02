class Details {
    String name;
    int roll;
    char division;

    Details(String name, int roll, char division) {
        this.name = name;
        this.roll = roll;
        this.division = division;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + roll);
        System.out.println("Division : " + division);
    }
}

public class student {
    public static void main(String[] args) {

        String name = "Sanika";
        int roll = 25;
        char division = 'A';

        Details d = new Details(name, roll, division);
        d.display();
    }
}

