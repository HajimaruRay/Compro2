import java.util.Scanner;

public class P5_HowToBreak
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        int check = 0;

        while (true)
        {
            number = sc.nextInt();

            if (number == 0)
            {
                System.out.println(check);
                break;
            }
            else
            {
                check++;
            }
        }
        sc.close();
    }
}