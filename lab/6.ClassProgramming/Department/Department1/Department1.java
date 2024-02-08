import java.util.Scanner;

class Dept
{
    int CountSensei;
    int CountStudent;
    int ministryBudget = 0;
    int eduFee = 0;
    int serviceFee = 300000;
    int donation = 100000;

    Dept(int CountSensei, int CountStudent)
    {
        this.CountSensei = CountSensei;
        this.CountStudent = CountStudent;
    }

    void computeIncome(int CountSensei, int CountStudent)
    {
        ministryBudget = (CountSensei * 500000) + (CountStudent * 3000);
        eduFee = CountStudent * 5000;

    }

    void printReport()
    {
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
    
}

public class Department1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int CountSensei = sc.nextInt();
        int CountStudent = sc.nextInt();
        Dept dp = new Dept(CountSensei, CountStudent);
        dp.computeIncome(CountSensei, CountStudent);
        dp.printReport();
        sc.close();
    }
}