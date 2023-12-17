import java.util.Scanner;

public class Slotreservation 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int CountManyBoundArr = sc.nextInt();
        int CountManyDataInArr = sc.nextInt();
        int CountManyInput = sc.nextInt();
        int Arr1[] = new int[CountManyBoundArr + 1];
        int Arr2[] = new int[CountManyBoundArr + 1];
        int number = 0;

        for (int i = 0;i < CountManyInput;i++)
        {
            number = sc.nextInt();

            if (Arr1[number] < CountManyDataInArr)
            {
                Arr1[number]++;
                System.out.println("1");
            }
            else
            {
                Arr2[number]++;
                System.out.println("2");
            }
        }

        for (int i = 1;i <= CountManyBoundArr;i++)
        {
            System.out.printf("%d ",Arr1[i]);
        }
        System.out.println();
        for (int i = 1;i <= CountManyBoundArr;i++)
        {
            System.out.printf("%d ",Arr2[i]);
        }
        sc.close();
    }    
}
