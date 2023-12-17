import java.util.Scanner;

public class IndexOf2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Text1 = sc.nextLine();
        String Text2 = sc.nextLine();
        int count[] = new int [Text1.length()];
        int loop = 0 , leastsame = -1;
        boolean Ishave = false;

        for (int i = 0;i < Text1.length();i++)
        {
            if (Text1.indexOf(Text2, i) != -1 && leastsame != Text1.indexOf(Text2, i))
            {
                count[loop] = Text1.indexOf(Text2 ,i);
                leastsame = Text1.indexOf(Text2 ,i);
                loop++;
                Ishave = true;
            }
        }

        if (Ishave == true)
        {
            for (int i = 0;i < loop;i++)
            {
                System.out.printf("%d ",count[i] + 1);
            }
        }
        else
        {
            System.out.println("string not found");
        }
        sc.close();
    }
}
