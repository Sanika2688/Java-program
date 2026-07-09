class Calculator{
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class calculator_overloading {
public static void main(String[] args) {
    Calculator calc = new Calculator();

    System.out.println("Integer Addition (2 parameters): " + calc.add(10, 20));
    System.out.println("Double Addition: (2 parameters) " + calc.add(10.5, 20.9));
    System.out.println("Integer Addition (3 parameters): " + calc.add(10, 20, 30));
}    
}
