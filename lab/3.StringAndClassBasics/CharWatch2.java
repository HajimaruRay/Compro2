import java.util.Scanner;

public class CharWatch2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int countFound[] = new int[3];
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        char Text1 = s1.charAt(0);
        char Text2 = s2.charAt(0);
        char Text3 = s3.charAt(0);
        int TextArrey = sc.nextInt();
        String MainText[] = new String[TextArrey];
        for (int i = 0;i < TextArrey;i++)
        {
            MainText[i] = sc.next();
        }
        int CountN = sc.nextInt();
        for (int i = 0;i < CountN;i++)
        {
            int IndexInterest = sc.nextInt() - 1;

            for (int a = 0;a < TextArrey;a++)
            {
                if (IndexInterest >= MainText[a].length() || IndexInterest < 0)
                {
                    continue;
                }
                else if (MainText[a].charAt(IndexInterest) == Text1) 
                {
                    countFound[0]++;
                } 
                else if (MainText[a].charAt(IndexInterest) == Text2) 
                {
                    countFound[1]++;
                } 
                else if (MainText[a].charAt(IndexInterest) == Text3) 
                {
                    countFound[2]++;
                }
            } 
        }

        for (int i = 0;i < countFound.length;i++)
        {
            System.out.println(countFound[i]);
        }
        sc.close();
    }     
}