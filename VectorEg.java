import java.util.Vector;

public class VectorEg {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<>();

        number.add(100);
        number.add(200);
        number.add(300);

        System.out.println("Vector: " + number);
        number.remove(1);
        System.out.println("After removing 1: " + number);

        System.out.println("Size of the vector: " + number.size());
        System.out.println("Element at index 0: " + number.get(0)); 
    }
} 
