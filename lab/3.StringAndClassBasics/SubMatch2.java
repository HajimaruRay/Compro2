import java.util.Scanner;

public class SubMatch2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String mainText = sc.nextLine();
        String subText = sc.nextLine();
        int count[] = new int[subText.length() - 2];
        for (int i = 0;i < subText.length() - 2;i++)
        {
            if (mainText.indexOf(subText.substring(i, i + 3)) > -1)
            {
                count[i] = mainText.indexOf(subText.substring(i, i + 3)) + 1;
            }
        }
        for (int i = 0;i < count.length;i++)
        {
            if (count[i] != 0)
            {
                System.out.println(count[i]);
            }
            else
            {
                System.out.println("No");
            }
            
        }
        sc.close();
    }
}