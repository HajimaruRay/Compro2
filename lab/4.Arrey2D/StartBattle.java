import java.util.Scanner;

public class StartBattle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int HitInRange = 0,DontHitInRange = 0,SamePlaceHit = 0,SamePlaceDontHit = 0,OutOfRange = 0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int Range[][] = new int[row][col];
        int HitCheck[][] = new int[row][col];
        int DontHitCheck[][] = new int[row][col];
        for (int r = 0;r < row;r++)
        {
            for (int c = 0;c < col;c++)
            {
                Range[r][c] = sc.nextInt();
            }
        }
        int loop = sc.nextInt();
        for (int i = 0;i < loop;i++)
        {
            int shoot1 = sc.nextInt() - 1;
            int shoot2 = sc.nextInt() - 1;

            if ((shoot1 >= 0 && shoot1 < row) && (shoot2 >= 0 && shoot2 < col))
            {
                if (Range[shoot1][shoot2] == 1 && HitCheck[shoot1][shoot2] == 0)
                {
                    HitInRange++;
                    HitCheck[shoot1][shoot2]++;
                }
                else if (Range[shoot1][shoot2] == 1 && HitCheck[shoot1][shoot2] > 0)
                {
                    SamePlaceHit++;
                }
                else if (DontHitCheck[shoot1][shoot2] > 0)
                {
                    SamePlaceDontHit++;
                }
                else
                {
                    DontHitInRange++;
                    DontHitCheck[shoot1][shoot2]++;
                }
            }
            else
            {
                OutOfRange++;
            }
        }
        System.out.println(HitInRange);
        System.out.println(DontHitInRange);
        System.out.println(SamePlaceHit);
        System.out.println(SamePlaceDontHit);
        System.out.println(OutOfRange);
        
        sc.close();
    }
}