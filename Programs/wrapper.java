public class wrapper {
    public static void main (String[] args){
        int x = 5;
        Integer wrappedX = Integer.valueOf(x);
        int unwrappedX = wrappedX.intValue();
        System.out.println("Wrapped: " + wrappedX + ", Unwrapped: " + unwrappedX);
    }
}
