import java.util.Scanner;

class Banksaving2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Saving saving = new Saving(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) 
        {
            int command = scan.nextInt();

            if (command == 1)
            {
                saving.printInfo();
            }
            else if (command == 2)
            {
                saving.checkBalance();
            }
            else if (command == 3)
            {
                saving.closesaving();
            }
            else if (command == 4)
            {
                double depositmoney = scan.nextDouble();
                if (saving.active)
                {
                    saving.deposit(depositmoney);
                    System.out.println(saving.balance + " true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if (command == 5)
            {
                double withdrawnmoney = scan.nextDouble();
                if (saving.active && (saving.balance - withdrawnmoney) >= 0)
                {
                    saving.withdrawn(withdrawnmoney);
                    System.out.println(saving.balance + " true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if (command == 6)
            {
                int Check = scan.nextInt();
                String data = scan.next();
                saving.openPromptPay(Check, data);
                
            }
        }
        scan.close();
    }
}