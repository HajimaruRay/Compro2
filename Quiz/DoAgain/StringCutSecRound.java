import java.util.Scanner;

public class StringCutSecRound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean IsHave = false;
        int count = 0;
        String Text = sc.nextLine();
        String Text1 = sc.nextLine();
        String TextSp[] = Text.split(Text1);

        //Check Zone
        for (int i = 0;i < TextSp.length;i++)
        {
            if (TextSp[i].isEmpty() == false)
            {
                count++;
                IsHave = true;
            }
        }

        //Print Zone
        if (IsHave == false)
        {
            System.out.println("no output");
        }
        else if (TextSp.length == count)
        {
            System.out.println("no target character found");
        }
        else
        {
            for (int i = 0;i < TextSp.length;i++)
            {
                /*if (TextSp[i].isEmpty() == false)
                {
                    System.out.println(TextSp[i]);
                }*/
                System.out.println(TextSp[i]);
            } 
        }

        sc.close();
    }    
}
