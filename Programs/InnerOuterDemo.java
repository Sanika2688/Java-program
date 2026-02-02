class OuterClass {

    int outerValue = 50;

    class InnerClass {
        void show() {
            System.out.println("Outer value from Inner class: " + outerValue);
        }
    }
}

public class InnerOuterDemo {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.show();
    }
}
