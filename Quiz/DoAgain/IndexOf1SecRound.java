import java.util.Scanner;

public class IndexOf1SecRound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Text1 = sc.nextLine();
        String Text2 = sc.nextLine();

        if (Text1.indexOf(Text2) > -1)
        {
            System.out.println(Text1.indexOf(Text2) + 1);
        }
        else
        {
            System.out.println("string not found");
        }
        sc.close();
    }    
}
