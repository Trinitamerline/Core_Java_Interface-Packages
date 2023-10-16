package pkbanking;

import pkbanking.pkcustomer.Customer;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Customer[] customer = new Customer[5];
        int ch1,ch2,ch3,cid;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("SB Account ---1");
            System.out.println("FD Account ---2");
            System.out.println("Exit ---3");
            System.out.println("Enter your choice");
            ch1 = scanner.nextInt();
            switch(ch1)
            {
                case 1:
                    do
                    {
                        System.out.println("New SB Account Opening---1");
                        System.out.println("Deposit ---2");
                        System.out.println("Withdraw ---3");
                        System.out.println("Calculate Interest---4");
                        System.out.println("Exit ---5");

                        System.out.println("Enter your choice");
                        ch2 = scanner.nextInt();
                        switch(ch2)
                        {
                            case 1:
                                System.out.println("Enter name & address");
                                String name = scanner.next();
                                String address = scanner.next();
                                customer[i] = new Customer(i,name,address);
                                customer[i].createAccount(1);
                                i++;
                                break;

                            case 2:
                                System.out.println("Enter Customer id :");
                                cid = scanner.nextInt();
                                customer[cid].transaction(1);
                                break;

                            case 3:
                                System.out.println("Enter Customer id :");
                                cid = scanner.nextInt();
                                customer[cid].transaction(2);
                                break;

                            case 4:
                                System.out.println("Enter Customer id :");
                                cid = scanner.nextInt();
                                customer[cid].transaction(3);
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }
                    }while(ch2!=5);
                    break;

                case 2:
                    do
                    {
                        System.out.println("New FD Account Opening---1");
                        System.out.println("FD close ---2");
                        System.out.println("Exit ---3");
                        System.out.println("Enter your choice");
                        ch3 = scanner.nextInt();
                        switch(ch3)
                        {
                            case 1:
                                System.out.println("Enter name & address");
                                String name = scanner.next();
                                String address = scanner.next();
                                customer[i] = new Customer(i,name,address);
                                customer[i].createAccount(2);
                                i++;
                                break;

                            case 2:
                                System.out.println("Enter Customer id :");
                                cid = scanner.nextInt();
                                customer[cid].transaction(4);
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }
                    }while(ch3!=3);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(ch1!=3);
    }
}
