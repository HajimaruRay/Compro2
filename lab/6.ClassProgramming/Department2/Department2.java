import java.util.Scanner;

class Dept1
{
    int CountSensei;
    int CountStudent;
    int ministryBudget = 0;
    int eduFee = 0;
    int serviceFee = 300000;
    int donation = 100000;
    int salary = 0;
    int elec = 0;
    int eduCost = 0;

    Dept1(int CountSensei, int CountStudent)
    {
        this.CountSensei = CountSensei;
        this.CountStudent = CountStudent;
    }

    void computeIncome(int CountSensei, int CountStudent)
    {
        ministryBudget = (CountSensei * 500000) + (CountStudent * 3000);
        eduFee = CountStudent * 5000;
    }

    void computeExpense(int CountSensei, int CountStudent)
    {
        salary = CountSensei * 600000;
        elec = (CountSensei+CountStudent) * 2000;
        eduCost = CountStudent * 4000;
    }

    void printReport()
    {
        int allin = ministryBudget + eduFee + serviceFee + donation;
        int allexp = salary + elec + eduCost;
        System.out.println("total income = " + allin);
        System.out.println("total expense = " + allexp);
        System.out.println("income - expense = " + (allin - allexp));
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
    
}

public class Department2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int CountSensei = sc.nextInt();
        int CountStudent = sc.nextInt();
        sc.close();
        Dept1 dp = new Dept1(CountSensei, CountStudent);
        dp.computeIncome(CountSensei, CountStudent);
        dp.computeExpense(CountSensei, CountStudent);
        dp.printReport();
    }
}