import java.util.Scanner;

public class CharWatch1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int countFound[] = new int[4];
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        char Text1 = s1.charAt(0);
        char Text2 = s2.charAt(0);
        char Text3 = s3.charAt(0);
        
        String MainText = sc.next();
        int CountN = sc.nextInt();
        for (int i = 0;i < CountN;i++)
        {
            int IndexInterest = sc.nextInt() - 1;

            if (IndexInterest >= MainText.length() || IndexInterest < 0)
            {
                countFound[3]++;
                continue;
            }
            else if (MainText.charAt(IndexInterest) == Text1) 
            {
                countFound[0]++;
            } 
            else if (MainText.charAt(IndexInterest) == Text2) 
            {
                countFound[1]++;
            } 
            else if (MainText.charAt(IndexInterest) == Text3) 
            {
                countFound[2]++;
            }
        }

        for (int i = 0;i < countFound.length;i++)
        {
            System.out.println(countFound[i]);
        }
        sc.close();
    }     
}