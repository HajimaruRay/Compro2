import java.util.Scanner;

public class P1_Lease1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Countkuha = sc.nextInt();
        int[] kuha = new int[Countkuha];

        for (int i = 0;i < kuha.length;i++)
        {
            kuha[i] = sc.nextInt();
        }

        int year = sc.nextInt();
        int yearcount = year;

        for (int i = 0;i < kuha.length;i++)
        {
            yearcount += (kuha[i] - 1);
            System.out.printf("%d ",yearcount);
            yearcount = year;
        }
        sc.close();
    }
}