abstract class Calculator {

    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);

    void showMessage() {
        System.out.println("Simple Calculator Using Abstract Class");
    }
}

class MyCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

public class AbstractCalculator {
    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator();
        calc.showMessage();

        System.out.println("Addition: " + calc.add(10, 20));
        System.out.println("Subtraction: " + calc.subtract(50, 15));
        System.out.println("Multiplication: " + calc.multiply(6, 7));
        System.out.println("Division: " + calc.divide(40, 5));
    }
}
