public class Person {
    String name;

    void display(){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args){
        Person p = new Person();
        Person q = new Person();
        

        p.name = "Sanika";
        q.name = "Shubham";
        
        p.display();
        q.display();
    }
}
