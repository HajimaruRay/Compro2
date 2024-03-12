import java.util.Scanner;

public class SeparateCharactersAndNumbers 
{
    static String split(String msg) 
    {
        if (msg.length() <= 0)
        {
            return "";
        }
        if (Character.isLetter(msg.charAt(0)))
        {
            return msg.charAt(0) + split(msg.substring(1));
        }
        else
        {
            return split(msg.substring(1)) + msg.charAt(0);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
        sc.close();
    }
}