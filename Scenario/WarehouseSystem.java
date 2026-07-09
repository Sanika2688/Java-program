abstract class Robot {
    private String batteryId;
    protected float chargeLevel; 

    public Robot(String batteryId, float chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() { 
        return batteryId; 
    }

    public void reportStatus() {
        System.out.println("Robot " + batteryId + " | Current Charge: " + chargeLevel + "%");
    }

    public abstract void performTask();
}

class DroneRobot extends Robot {
    public DroneRobot(String batteryId, float chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel >= 15.0f) {
            System.out.println("Drone " + getBatteryId() + " flying at 2x speed...");
            chargeLevel -= 15.0f; 
        } else {
            System.out.println("Drone " + getBatteryId() + ": Low battery! Cannot fly.");
        }
    }
}

class GroundRobot extends Robot {
    public GroundRobot(String batteryId, float chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel >= 5.0f) {
            System.out.println("Ground Unit " + getBatteryId() + " performing surface check...");
            chargeLevel -= 5.0f;
        } else {
            System.out.println("Ground Unit " + getBatteryId() + ": Low battery! Cannot move.");
        }
    }
}


public class WarehouseSystem {
    public static void main(String[] args) {
        Robot[] fleet = {
            new DroneRobot("D-1", 20.0f),  
            new GroundRobot("G-5", 10.0f), 
            new DroneRobot("D-2", 10.0f)   
        };

        System.out.println("--- Warehouse Fleet Operation Start ---\n");

        for (Robot r : fleet) {
            r.performTask();    
            r.reportStatus();   
            System.out.println("---------------------------------------");
        }
    }
}
