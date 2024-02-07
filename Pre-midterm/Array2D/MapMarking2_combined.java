import java.util.Scanner;

public class MapMarking2_combined
{
    boolean walkcheck(int R, int C,int Map[][])
    {
        for (int i = 0;i < R;i++)
        {
            for (int j = 0;j < C;j++)
            {
                if (Map[i][j] == 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    int walkLeft(int positionR,int positionC,int C,int Map[][])
    {
        for (int j = positionC;j > 0;j--)
        {
            if (Map[positionR][j] == 0)
            {
                return j;
            }
        }
        for (int j = C;j > positionC;j--)
        {
            if (Map[positionR][j] == 0)
            {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        MapMarking2_combined Mc = new MapMarking2_combined();
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Map[][] = new int[R][C];
        int StartR = sc.nextInt()-1;
        int StartC = sc.nextInt()-1;
        Map[StartR][StartC]++;
        int positionR = StartR;
        int positionC = StartC;
        int n = sc.nextInt();

        for (int i = 0;i < n;i++)
        {
            int walk = sc.nextInt();

            if (walk == 1)
            {
                if (Mc.walkcheck(R, C, Map))
                {
                    positionC = Mc.walkLeft(positionR, positionC, C, Map);
                    Map[positionR][positionC]++;
                }
            }
            if (walk == 2)
            {
                if ((positionC+1) < C)
                {
                    Map[positionR][positionC+1]++;
                }
            }
            if (walk == 3)
            {
                if ((positionR-1) >= 0)
                {
                    Map[positionR-1][positionC]++;
                }
            }
            if (walk == 4)
            {
                if ((positionR+1) < R)
                {
                    Map[positionR+1][positionC]++;
                }
            }
        }

        System.out.println((positionR+1) + " " + (positionC+1));
        int count = 0;
        for (int i = 0;i < R;i++)
        {
            for (int j = 0;j < C;j++)
            {
                if (Map[i][j] > 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}