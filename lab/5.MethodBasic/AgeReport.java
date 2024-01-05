import java.util.Scanner;

public class AgeReport 
{
    public void Count(int range1,int range2,int Number[],int Age[])
    {
        int c = 0;
        for (int i = 0;i < Age.length;i++)
        {
            if (Age[i] >= range1 && Age[i] <= range2)
            {
                System.out.println(Number[i]);
                c++;
            }
        }
        System.out.printf("There are %d persons in age range of %d to %d",c,range1,range2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AgeReport ag = new AgeReport();
        int loop = sc.nextInt();
        int Number[] = new int[loop];
        int Age[] = new int[loop];
        for (int i = 0;i < loop;i++)
        {
            Number[i] = sc.nextInt();
            Age[i] = sc.nextInt();
        }
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();
        ag.Count(range1, range2, Number, Age);
        sc.close();
    }    
}
