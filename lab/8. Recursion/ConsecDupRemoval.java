import java.util.Scanner;

public class ConsecDupRemoval 
{
    String dupRemove(String str) 
    {
        if (str.length() <= 1)
        {
            return str;
        }
        if (str.substring(0, 1).equals(str.substring(1, 2)))
        {
            return dupRemove(str.substring(1));
        }
        else
        {
            return str.charAt(0) + dupRemove(str.substring(1));
        }
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
        scan.close();
    }
}