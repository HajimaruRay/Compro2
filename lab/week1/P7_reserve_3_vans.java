import java.util.Scanner;

public class P7_reserve_3_vans 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int VanA = 0,VanB = 0,VanC = 0;
        int loop = sc.nextInt();

        while (loop > 0)
        {
            int rent = sc.nextInt();

            if (VanA <= VanB && VanA <= VanC)
            {
                System.out.println("A");
                VanA += rent;
            }
            else if (VanB <= VanC)
            {
                System.out.println("B");
                VanB += rent;
            }
            else
            {
                System.out.println("C");
                VanC += rent;
            }
            loop--;
        }
        sc.close();
    }
}
