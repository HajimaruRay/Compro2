import java.util.Scanner;

public class CyclicString2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int Wantto =  sc.nextInt();
        char subtext[] = text.toCharArray();
        int loop = Wantto / subtext.length;
        int subloop = (Wantto - loop*text.length());

        for (int i = 0;i < loop;i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(text);
            }
            else
            {
                for (int j = text.length();j > 0;j--)
                {
                    System.out.print(subtext[j - 1]);
                }
            }
        }

        if (subloop > 0)
        {
            if ((loop+1) % 2 == 0)
            {
                for (int i = text.length();i > (text.length() - subloop);i--)
                {
                    System.out.print(subtext[i-1]);
                }
            }
            else
            {
                for (int i = 0;i < subloop;i++)
                {
                    System.out.print(subtext[i]);
                }
            }
        }
        sc.close();
    }
}
