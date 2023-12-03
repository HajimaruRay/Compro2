import java.util.Scanner;

public class P6_odd_vs_even 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        int even = 0,odd = 0,count = 0;

        do
        {
            number = sc.nextInt();

            if (number % 2 == 0)
            {
                even += number;
                count++;
            }
            else
            {
                odd += number;
                count++;
            }
        } while (count != 8);


        if (even > odd)
        {
            System.out.println("even");
            System.out.println(even);
            System.out.println(odd);
        }
        else if (odd > even)
        {
            System.out.println("odd");
            System.out.println(even);
            System.out.println(odd);
        }
        else
        {
            System.out.println("equal");
            System.out.println(even);
            System.out.println(odd);
        }
        sc.close();
    }
}
