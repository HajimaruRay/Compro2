import java.util.Scanner;

public class LongestCount 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0,maxi = 0,lastmax = 0;

        while(true)
        {
            String Text = sc.nextLine();
            if (Text.length() == 0)
            {
                break;
            }
            if (max <= Text.length())
            {
                max = Text.length();
                if (lastmax != max)
                {
                    maxi = 0;
                    lastmax = Text.length();
                }
                maxi++;
            }
            
        }
        System.out.println(max);
        System.out.println(maxi);
        sc.close();
    }
}