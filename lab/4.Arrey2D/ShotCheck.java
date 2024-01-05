import java.util.Scanner;

public class ShotCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Inrange = 0,Outrange = 0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int loop = sc.nextInt();
        for (int i = 0;i < loop;i++)
        {
            int shoot1 = sc.nextInt();
            int shoot2 = sc.nextInt();

            if ((shoot1 > 0 && shoot1 <= row) && (shoot2 > 0 && shoot2 <= col))
            {
                Inrange++;
            }
            else
            {
                Outrange++;
            }
        }
        System.out.println(Inrange);
        System.out.println(Outrange);
        sc.close();
    }
}