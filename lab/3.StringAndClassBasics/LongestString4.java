import java.util.Scanner;

public class LongestString4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0,maxi = 0,i = 0;
        String Check[] = new String[1000];

        while(true)
        {
            String Text = sc.nextLine();
            if (Text.length() == 0)
            {
                break;
            }
            Check[i] = Text;
            if (max <= Check[i].length())
            {
                max = Check[i].length();
                maxi = i;
            }
            i++;
        }
        System.out.println(Check[maxi]);
        sc.close();
    }
}