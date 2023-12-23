import java.util.Scanner;

public class MainCollor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String CollorNo1 = sc.next();
        String CollorNo2 = sc.next();

        if (CollorNo1.equalsIgnoreCase("Red") && CollorNo2.equalsIgnoreCase("Blue") || CollorNo1.equalsIgnoreCase("Blue") && CollorNo2.equalsIgnoreCase("Red"))
        {
            System.out.println("Purple");
        }
        else if (CollorNo1.equalsIgnoreCase("Red") && CollorNo2.equalsIgnoreCase("Yellow") || CollorNo1.equalsIgnoreCase("Yellow") && CollorNo2.equalsIgnoreCase("Red"))
        {
            System.out.println("Orange");
        }
        else if (CollorNo1.equalsIgnoreCase("Blue") && CollorNo2.equalsIgnoreCase("Yellow") || CollorNo1.equalsIgnoreCase("Yellow") && CollorNo2.equalsIgnoreCase("Blue"))
        {
            System.out.println("Green");
        }

        sc.close();
    }
}