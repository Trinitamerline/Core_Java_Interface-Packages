package pkbanking.pkcustomer;

import pkbanking.pkaccount.fd.FDAccount;
import pkbanking.pkaccount.sb.SBAccount;

import java.util.Scanner;

public class Customer {
    int cust_id;
    String name;
    String address;
    SBAccount sb;
    FDAccount fd;
    static int sbno = 349076;
    static int fdno = 259465;
    Scanner scanner = new Scanner(System.in);

    public Customer(int cust_id, String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }

    public void createAccount(int type) {

        if (type == 1)
        {
            System.out.println("Enter initial amount for SB Account");
            double balance = scanner.nextDouble();
            sb = new SBAccount(sbno++, balance);
        }
        else if (type == 2)
        {
            System.out.println("Enter deposit amount & period for FD Account");
            double balance = scanner.nextDouble();
            int period = scanner.nextInt();
            fd = new FDAccount(fdno++, balance, period);
        }
        else
            System.out.println("Invalid Choice");

    }

    public void transaction(int type)
    {
        if (type == 1)
        {
            System.out.println("Enter deposit amount");
            double amount = scanner.nextDouble();
            sb.deposit(amount);
        }
        else if (type == 2)
        {
            System.out.println("Enter withdraw amount");
            double amt = scanner.nextDouble();
            sb.withdraw(amt);
        }
        else if (type == 3)
        {
            sb.calc_interest();
        }
        else if (type == 4)
        {
            fd.close();
        }
        else
            System.out.println("Invalid choice");
    }
}
