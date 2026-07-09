class Employee {
    String name;
    float salary;
    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }
    float calculateSalary(){
        return salary + (0.05f * salary);
    }
}

class Manager extends Employee{
    Manager(String name, float salary){
        super(name, salary);
    }
    float calculateSalary(){
        return super.calculateSalary() + 2000f;
}
}

class Executive extends Manager{
    Executive(String name, float salary){
        super(name, salary);
    }
    float calculateSalary(){
        return super.calculateSalary() + (0.1f * salary);
}
}

public class InterestSystem {
    public static void main(String[] args) {
        Employee emp = new Employee ("Alice", 10000);
        System.out.println("Salary for Employee: " + String.format("%.2f", emp.calculateSalary()) + ", a flat 5% housing allowance has been added");
        Manager mgr = new Manager ("Bob", 10000);
        System.out.println("Salary for Manager: " + String.format("%.2f", mgr.calculateSalary()) + ", Management Bonus of 2000 bonus has been added");
        Executive exec = new Executive ("Charlie", 10000);
        System.out.println("Salary for Executive: " + String.format("%.2f", exec.calculateSalary()) + ", Performance Incentive of 10% has been added");
    }
}
