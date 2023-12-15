import java.util.Scanner;

public class NumberOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Count = sc.nextInt();
        int[] Number = new int[Count];

        for (int loop = 0;loop < Number.length;loop++)
        {
            Number[loop] = sc.nextInt();
        }

        int check = sc.nextInt();
        boolean IsHave = false;

        for (int loop = 0;loop < Number.length;loop++)
        {
            if (check == Number[loop])
            {
                System.out.print(loop+1 + " ");
                IsHave = true;
            }
        }
        if (IsHave == false)
        {
            System.out.print("0");
        }
        sc.close();
    }
}