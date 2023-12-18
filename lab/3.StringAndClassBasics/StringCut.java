import java.util.Scanner;

public class StringCut 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Text1 = sc.nextLine();
        String Text2 = sc.nextLine();
        String Text3[] = Text1.split(Text2);
        int countNotFound = 0;

        int Ishave = Text1.indexOf(Text2);
        for (int i = 0;i < Text3.length;i++)
        {
            if (Text3[i].equalsIgnoreCase("") == true)
            {
                countNotFound++;
            }
        }

        if (countNotFound == Text3.length)
        {
            System.out.println("no output");
        }
        else if (Ishave == -1)
        {
            System.out.println("no target character found");
        }
        else
        {
            for (int i = 0;i < Text3.length;i++)
            {
                if (Text3[i].equalsIgnoreCase("") == false)
                {
                    System.out.println(Text3[i]);
                }
            }
        }
        sc.close();
    }    
}
