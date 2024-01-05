import java.util.Scanner;

public class IndexOf2SecRound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean Isfound = false;
        int Leastnumber = 0;
        String Text1 = sc.nextLine();
        String Text2 = sc.nextLine();
        int Ans[] = new int[Text1.length()];
        for (int i = 0;i < Text1.length();i++)
        {
            if (Text1.indexOf(Text2,i) + 1 != Leastnumber)
            {
                Ans[i] = Text1.indexOf(Text2,i) + 1;
                Leastnumber = Ans[i];
                Isfound = true;
            }
        }

        if (Isfound == true)
        {
            for (int i = 0;i < Ans.length;i++)
            {
                if(Ans[i] != 0)
                {
                    System.out.print(Ans[i] + " ");
                }
            }
        }
        else if (Isfound == false)
        {
            System.out.println("string not found");
        }
        
        sc.close();
    }    
}
