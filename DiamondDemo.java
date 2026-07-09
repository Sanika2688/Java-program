interface A {
    void show();
}

interface B extends A {
    default void show() {
        System.out.println("Show method from B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("Show method from C");
    }
}

class D implements B, C {
    @Override
    public void show() {
        System.out.println("Resolved show() in D");
        B.super.show();
        C.super.show();
    }
}

public class DiamondDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
