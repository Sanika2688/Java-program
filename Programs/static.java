class Demo {
    static int count = 0;   

    static void increment() {   
        count++;
        System.out.println("Count = " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo.increment();
        Demo.increment();
        Demo.increment();
    }
}

