abstract class Transport {

}

interface GPS {
    void getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    
}

public class SmartLogisticSyst {