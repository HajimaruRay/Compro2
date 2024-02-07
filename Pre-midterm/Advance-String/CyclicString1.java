import java.util.Scanner;

public class CyclicString1
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
            System.out.print(text);
        }
        if (subloop > 0)
        {
            for (int i = 0;i < subloop;i++)
            {
                System.out.print(subtext[i]);
            }
        }
        sc.close();
    }
}
