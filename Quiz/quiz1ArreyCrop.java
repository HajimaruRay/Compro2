import java.util.Scanner;

public class quiz1ArreyCrop
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int CountNumebr = sc.nextInt();
        int Number[] = new int[CountNumebr + 1];
        for (int i = 1;i < Number.length;i++)
        {
            Number[i] = sc.nextInt();
        }
        int CropHead = sc.nextInt();
        int CropTail = sc.nextInt();
        sc.close();

        if (CropHead >= 1 || CropTail < Number.length)
        {
            if (CropHead < 1)
            {
                CropHead = 1;
            }
            if (CropHead > Number.length)
            {
                CropHead = Number.length;
            }
            if (CropTail < 1)
            {
                CropTail = 1;
            }
            if (CropTail > Number.length)
            {
                CropTail = Number.length;
            }

            if (CropHead < CropTail)
            {
                for (;CropHead <= CropTail;CropHead++)
                {
                    System.out.printf("%d ",Number[CropHead]);
                }
            }
            else if (CropHead > CropTail)
            {
                for (;CropHead >= CropTail;CropHead--)
                {
                    System.out.printf("%d ",Number[CropHead]);
                }
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}