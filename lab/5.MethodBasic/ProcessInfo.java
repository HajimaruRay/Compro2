import java.util.Scanner;

public class ProcessInfo 
{
    public static void PG(String Program[], int RamUse[],int HaveRam)
    {
        int sum = 0;
        for (int i = 0;i < Program.length;i++)
        {
            if (RamUse[i] < 10)
            {
                System.out.println(Program[i] + " " + RamUse[i]);
            }
            else
            {
                System.out.println(Program[i] + "* " + RamUse[i]);
            }
            sum += RamUse[i];
        }
        System.out.printf("RAM used = %d out of %d", sum, HaveRam);
        if (sum > HaveRam)
        {
            System.out.println("Not enough RAM");
        }
        else
        {
            System.out.println("Sufficient RAM");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String Program[] = new String[loop];
        int RamUse[] = new int[loop];
        for (int i = 0;i < loop ;i++)
        {
            Program[i] = sc.next();
            RamUse[i] = sc.nextInt();
        }
        int HaveRam = sc.nextInt();
        PG(Program, RamUse, HaveRam);
    
        sc.close();
    }   
}