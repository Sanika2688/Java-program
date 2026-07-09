abstract class Plan {
    private String PatientName;
    private float BaseFee;

    public Plan(String PatientName, float BaseFee) {
        this.PatientName = PatientName;
        this.BaseFee = BaseFee;
    }

    public String getPatientName() { return PatientName;}
    public float getBaseFee() { return BaseFee;}

    public abstract float calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan (String PatientName, float BaseFee) {
        super (PatientName, BaseFee);
    }
    @Override 
    public float calculateBill() {
        return getBaseFee() + 15.00f;
    }
}

class GoldPlan extends Plan {
    public GoldPlan (String PatientName, float BaseFee) {
         super (PatientName, BaseFee);
    }
    @Override
    public float calculateBill() {
        float surcharge = getBaseFee() * 0.10f;
        return getBaseFee() + surcharge - 20.0f;
    }
}

public class biling {
    public static void printInvoice(Plan p) {
        System.out.println("Patient: " + p.getPatientName());
        System.out.printf("Final Bill: $%.1f\n", p.calculateBill());
    }

    public static void main (String[] args){
        Plan p = new SilverPlan ("John", 100.0f);
        Plan p1 = new GoldPlan ("Sophia", 200.0f);
        Plan p2 = new GoldPlan ("Max", 50.0f);

        System.out.println("\nInvoice:");
        printInvoice(p);    
        printInvoice(p1);
        printInvoice(p2);
    }
}
