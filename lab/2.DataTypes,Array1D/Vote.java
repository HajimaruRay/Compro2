import java.util.Scanner;

public class Vote 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int NumberOfSorSor = sc.nextInt();
        int[] votecurrency = new int[NumberOfSorSor+1];
        int NumberOfPerp = sc.nextInt();
        int[] voteRe = new int[NumberOfPerp];

        for (int i = 0;i < NumberOfPerp;i++)
        {
            voteRe[i] = sc.nextInt();
            votecurrency[voteRe[i]]++;
        }

        int max = 0;
        int maxV = 0;

        for (int i = 0;i < votecurrency.length;i++)
        {
            if (max < votecurrency[i])
            {
                max = votecurrency[i];
                maxV = i;
            }
        }
        System.out.printf("%d\n%d",maxV,votecurrency[maxV]);
        sc.close();
    }    
}