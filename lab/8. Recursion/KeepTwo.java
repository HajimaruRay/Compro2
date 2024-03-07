import java.util.Scanner;

public class KeepTwo 
{
    String keepTwo(String str) 
    {
        if (str.length() <= 1)
        {
            return str;
        }
        String str2 = str.substring(0, str.length()-1);
        String last = str.substring(str.length()-1, str.length());
        int idx = str2.indexOf(last);
        int idx2 = str2.lastIndexOf(last);
        String ans = keepTwo(str2);
        if (idx == idx2)
        {
            ans += last;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
        scan.close();
    }
}