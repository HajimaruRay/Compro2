import java.util.Scanner;

public class BPDM
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Input Arrey Range 2D
        int HitAera[][] = new int[N][N];
        //Input HitAera Field
        for (int i = 0;i < N;i++)
        {
            for(int j = 0;j < N;j++)
            {
                HitAera[i][j] = sc.nextInt();
            }
        }
        int D = sc.nextInt(); //Input Damage
        int M = sc.nextInt(); //Input Count to Shoot
        for (int i = 0;i < M;i++)
        {
            //Input Field Hit
            int r = sc.nextInt();
            int c = sc.nextInt();

            //Print Damage
            System.out.println(D*HitAera[r][c]);
        }
        sc.close();
    }
}