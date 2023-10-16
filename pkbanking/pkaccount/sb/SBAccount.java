package pkbanking.pkaccount.sb;

import pkbanking.pkaccount.Account;
import pkbanking.pkinterface.Interest_Rate;
import pkbanking.pkinterface.Transaction;

public class SBAccount extends Account implements Transaction, Interest_Rate {
    public SBAccount() {
        super();
    }

    public SBAccount(int accnumber, double balance) {
        super(accnumber, balance);
        System.out.println("New SB Account Created");
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount > min_balance)
        {
            System.out.println("Current Balance:"+balance);
            balance = balance - amount;
            System.out.println("New Withdraw Balance:"+balance);
        }
        else
            System.out.println("Insufficient balance");
    }

    @Override
    public void deposit(double amount) {
        if(amount >= 0)
        {
            System.out.println("Current Balance:"+balance);
            balance = balance + amount;
            System.out.println("New Deposited Balance:"+balance);
        }
        else
            System.out.println("Invalid amount");
    }
    public void calc_interest()
    {
        System.out.println("Current balance:"+balance);
        balance = balance + balance * sbrate/12*100;
        System.out.println("New Balance With Interest:"+balance);
    }
}
