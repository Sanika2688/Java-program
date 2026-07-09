class GenericVehicle{
    int currentspeed;

    GenericVehicle(int speed){
        this.currentspeed = speed;
    }

    void speed(){
        System.out.println("Generic Vehicle Speed: " + currentspeed);
    }

    void fine(){
        System.out.println("No Fine");
    }
}

class Car extends GenericVehicle{
    Car (int speed){
    super(speed);
}
    void speed(){
        System.out.println("Car Speed");
    }

    void fine(){
        if (currentspeed > 1000) {
            System.out.println("Fine: 5000");
        } else {
            System.out.println("No Fine for Car");
        }
    }
}

class Bike extends GenericVehicle{
    Bike (int speed){
    super(speed);
    }

    void speed(){
        System.out.println("Bike Speed");
    }

    void fine(){
        if (currentspeed > 1500) {
            System.out.println("Fine: 2000");
        } else {
            System.out.println("No Fine for Bike");
        }
    }   
}


public class vehicleOverriding {
    public static void main(String[] args) {
        GenericVehicle gv = new GenericVehicle(800);
        gv.speed();
        gv.fine();

        Car car = new Car(1200);
        car.speed();
        car.fine();

        Bike bike = new Bike(600);
        bike.speed();
        bike.fine();
    }
    
}
