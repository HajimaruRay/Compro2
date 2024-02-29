import java.util.Scanner;

public class BankAccount1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account account = new Account(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) 
        {
            int command = scan.nextInt();

            if (command == 1)
            {
                account.printInfo();
            }
            else if (command == 2)
            {
                account.checkBalance();
            }
            else if (command == 3)
            {
                account.closeAccount();
            }
            else if (command == 4)
            {
                double depositmoney = scan.nextDouble();
                if (account.active)
                {
                    account.deposit(depositmoney);
                    System.out.println(account.balance + " true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if (command == 5)
            {
                double withdrawnmoney = scan.nextDouble();
                if (account.active && (account.balance - withdrawnmoney) >= 0)
                {
                    account.withdrawn(withdrawnmoney);
                    System.out.println(account.balance + " true");
                }
                else
                {
                    System.out.println("false");
                }
            }
        }
        scan.close();
    }
}