class Sample {
    static int staticVar = 0; 
    int instanceVar;           

    Sample(int x) {
        instanceVar = x;
        staticVar++;
    }

    void show() {  
        System.out.println("Static Variable = " + staticVar +
                           " | Instance Variable = " + instanceVar);
    }
}

public class instance {
    public static void main(String[] args) {
        Sample a = new Sample(10);
        Sample b = new Sample(20);

        a.show();
        b.show();
    }
}
