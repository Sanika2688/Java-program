class Account {
    float balance;

    Account(float balance) {
        this.balance = balance;
    }

    float calculateInterest() {
        return balance * 0.02f;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(float balance) {
        super(balance);
    }

    float calculateInterest() { 
        float interest = balance * 0.04f;

        if (balance > 50000) {
            interest = interest + 500f; 
            System.out.println("Balance is greater than 50000, so Loyalty Bonus of 500 is added.");
        }

        return interest;
    }
}

class FixedDeposit extends SavingsAccount { 
    FixedDeposit(float balance) {
        super(balance);
    }

    float calculateInterest() { 
        return super.calculateInterest() + (0.02f * balance);
}
}

public class bank {
    public static void main(String[] args) {
        Account acc = new Account(10000);
        System.out.println("Interest for Account: " + String.format("%.2f", acc.calculateInterest()));

        SavingsAccount sva = new SavingsAccount(10000);
        System.out.println("Interest for Savings Account: " + String.format("%.2f", sva.calculateInterest()));

        SavingsAccount sva2 = new SavingsAccount(60000);
        System.out.println("Interest for Savings Account: " + String.format("%.2f", sva2.calculateInterest()));

        FixedDeposit fd = new FixedDeposit(60000);
        System.out.println("Interest for Fixed Deposit: " + String.format("%.2f", fd.calculateInterest()));
    }
}

