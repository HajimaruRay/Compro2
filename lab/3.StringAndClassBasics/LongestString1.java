import java.util.Scanner;

public class LongestString1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        for (int i = 0;i < 5;i++)
        {
            String Text = sc.nextLine();
            if (max < Text.length())
            {
                max = Text.length();
            }
            
        }
        System.out.println(max);
        sc.close();
    }
}