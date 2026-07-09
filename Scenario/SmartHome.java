abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    void getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {

    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is booting up...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to Home_5G...");
    }

    @Override
    public void getEnergyRating() {
        System.out.println(brand + " TV energy rating: A++");
    }
}

class ElectricKettle extends Device {

    public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " kettle is heating water...");
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

        
        SmartTV tv = new SmartTV("Samsung");
        Device   asDevice = tv;
        RemoteControllable asRemote = tv;
        PowerSaving        asPower  = tv;

        asDevice.turnOn();          
        asRemote.connectToWifi();   
        asPower.getEnergyRating();  
    }
}