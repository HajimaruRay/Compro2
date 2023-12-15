import java.util.Scanner;

public class LongestString2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0,maxi = 0;
        String Check[] = new String[5];

        for (int i = 0;i < 5;i++)
        {
            String Text = sc.nextLine();
            Check[i] = Text;
            if (max < Check[i].length())
            {
                max = Check[i].length();
                maxi = i;
            }
            
        }
        System.out.println(Check[maxi]);
        sc.close();
    }
}