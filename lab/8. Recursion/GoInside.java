import java.util.Scanner;

public class GoInside 
{
    String goInside(String str, boolean front)
    {
        int l = str.length();
        if (l <= 1)
        {
            return str;
        }
        String Front = str.substring(0, 1);
        String str2 = str.substring(1, l-1);
        String Last = str.substring(l-1);

        String ans = goInside(str2, !front);

        if (front)
        {
            ans = Front + Last + ans;
        }
        else
        {
            ans = Last + Front + ans;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
        scan.close();
    }
}