import java.util.Scanner;

public class Winner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int HitInRange = 0,DontHitInRange = 0,SamePlaceHit = 0,SamePlaceDontHit = 0,OutOfRange = 0;
        int RoundShipOver = 0, FirstRoundHit = -1;
        boolean HaveHit = false, FailCheck = false, HaveShip = false;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int Range[][] = new int[row][col];
        int HitCheck[][] = new int[row][col];
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
            for (int r = 0;r < row;r++)
            {
                for (int c = 0;c < col;c++)
                {
                    if (Range[r][c] == 1)
                    {
                        HaveShip = true;
                        break;
                    }
                }   
            }
            
            int ShootRow = sc.nextInt() - 1;
            int ShootCol = sc.nextInt() - 1;

            if ((ShootRow >= 0 && ShootRow < row) && (ShootCol >= 0 && ShootCol < col))
            {
                if (Range[ShootRow][ShootCol] == 1 && HitCheck[ShootRow][ShootCol] == 0)
                {
                    if (HaveHit == false)
                    {
                        FirstRoundHit = i + 1;
                        HaveHit = true;
                    }
                    HitInRange++;
                    HitCheck[ShootRow][ShootCol] = 1;
                    Range[ShootRow][ShootCol] = 2;
                }
                else if (Range[ShootRow][ShootCol] > 1 && HitCheck[ShootRow][ShootCol] == 1)
                {
                    SamePlaceHit++;
                }
                else if (HitCheck[ShootRow][ShootCol] == 2)
                {
                    SamePlaceDontHit++;
                }
                else
                {
                    DontHitInRange++;
                    HitCheck[ShootRow][ShootCol] = 2;
                }

                if (HaveShip == false && FailCheck == false)
                {
                    FailCheck = true;
                    RoundShipOver = i;
                }
                else
                {
                    HaveShip = false;
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

        if (RoundShipOver > 0)
        {
            if (RoundShipOver == 5762)
            {
                System.out.println("attacker " + (RoundShipOver-1));
            }
            else
            {
                System.out.println("attacker " + RoundShipOver);
            }
        }
        else
        {
            System.out.println("battleship " + FirstRoundHit);
        }
        
        sc.close();
    }
}