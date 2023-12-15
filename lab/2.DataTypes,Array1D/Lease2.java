import java.util.Scanner;

public class Lease2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Countkuha = sc.nextInt();
        int[] kuha = new int[Countkuha];
        int[] yearcount = new int[Countkuha];

        for (int i = 0;i < kuha.length;i++)
        {
            kuha[i] = sc.nextInt();
        }

        int year = sc.nextInt();
        int year2 = year;

        for (int i = 0;i < kuha.length;i++)
        {
            year2 += (kuha[i] - 1);
            yearcount[i] = year2;
            year2 = year;
        }
        int countcheck = sc.nextInt();
        boolean IsEmty = false;

        for (int loop = 0;loop < countcheck;loop++)
        {
            int checkyear = sc.nextInt();

            for (int i = 0;i < yearcount.length;i++)
            {
                if (checkyear > yearcount[i])
                {
                    System.out.print(i+1 + " ");
                    IsEmty = true;
                }
            }
            if (IsEmty == false)
            {
                System.out.println("full");
            }
            else
            {
                System.out.println();
                IsEmty = false;
            }
        }
        sc.close();
    }    
}
