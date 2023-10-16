package pkbanking.pkaccount.fd;

import pkbanking.pkaccount.Account;
import pkbanking.pkinterface.Interest_Rate;

public class FDAccount extends Account implements Interest_Rate {
    int period;

    public FDAccount() {
        super();
    }

    public FDAccount(int accnumber, double balance, int period) {
        super(accnumber, balance);
        this.period = period;
        System.out.println("New FD Account Created");
    }
    public double calc_interest()
    {
        return balance*period*fdrate/(12*100);
    }
    public void close()
    {
        balance = balance + calc_interest();
    }
}
