import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Bannana");
        list.add("Cherry");

        System.out.println("Fruits in the list: " + list);
        list.remove("Bannana");
        System.out.println("After removing Bannana: " + list);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Contains Apple? " + list.contains("Apple")); 
    }
}