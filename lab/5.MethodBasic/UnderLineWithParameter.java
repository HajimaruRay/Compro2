import java.util.Scanner;

public class UnderLineWithParameter 
{
    public void Test(int Dat)
    {
        for (int i = 0;i < Dat;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        UnderLineWithParameter Te = new UnderLineWithParameter();
        int loop = sc.nextInt();
        for (int i = 0;i < loop;i++)
        {
            String Name = sc.next();
            int HowLongDat = sc.nextInt();
            System.out.println(Name);
            Te.Test(HowLongDat);
        }

        sc.close();
    }
}
