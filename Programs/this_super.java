class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void showValues() {
        System.out.println("Child value using this: " + this.value);
        System.out.println("Parent value using super: " + super.value);
    }
}

public class this_super {
    public static void main(String[] args) {
        Child c = new Child();
        c.showValues();
    }
}

