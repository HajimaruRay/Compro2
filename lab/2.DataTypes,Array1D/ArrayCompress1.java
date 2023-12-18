import java.util.Scanner;

public class ArrayCompress1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Howlong = sc.nextInt();
        int number[] = new int[Howlong];
        int numbersum[] = new int[Howlong];
        int loop = 0,count = 0;

        for (int i = 0;i < Howlong;i++)
        {
            number[i] = sc.nextInt();
        }
        int numbersplit = sc.nextInt();

        for (int i = 0;i < Howlong;i++)
        {
            if (number[i] != numbersplit)
            {
                numbersum[loop] += number[i];
            }
            else if (number[i] == numbersplit)
            {
                loop++;
                numbersum[loop] = numbersplit;
                count++;
                loop++;
            }
        }
        for (int i = 0;i < (count + (count + 1));i++)
        {
            System.out.printf("%d ",numbersum[i]);
        }
        sc.close();
    }    
}
