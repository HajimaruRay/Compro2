import java.util.Scanner;
import java.util.ArrayList;

public class InnerText
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int firstCut = 0;
        String Plaintext = sc.next();
        String LongPlanText = Plaintext;
        String Cut = sc.next();
        ArrayList<String> SplitText = new ArrayList<String>();

        for (int i = 0;i < 5;i++)
        {
            firstCut = LongPlanText.indexOf(Cut);
            Plaintext = LongPlanText.substring(firstCut + Cut.length());
            int lastCut = Plaintext.indexOf(Cut);
            if (lastCut == -1)
            {
                break;
            }
            LongPlanText = Plaintext;
            Plaintext = Plaintext.substring(0,lastCut);
            if (i % 2 == 0)
            {
                //System.out.println(Plaintext);
                SplitText.add(Plaintext);
            }
        }

        System.out.println(SplitText.size());
        for (int i = 0;i < SplitText.size();i++)
        {
            if (SplitText.get(i).length() > 0)
            {
                System.out.println(i+1 + " " + SplitText.get(i));
            }
            else
            {
                System.out.println(i+1 + " " + "_");
            }
        }
        sc.close();
    }
}