public class test {
    void modifyValue(int x) {
        x = x + 10;
    }

    public static void main (String[] args){
        int a = 5;
        test obj = new test();
        obj.modifyValue(a);
        System.out.println("Value of a: " + a);
    }
}
