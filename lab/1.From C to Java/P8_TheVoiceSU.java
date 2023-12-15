import java.util.Scanner;

public class P8_TheVoiceSU 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int score1M = 0,score2F = 0,keep = 0,sex = 0,count = 0,keepedM = 0,keepedF = 0;

        count = sc.nextInt();
        keep = sc.nextInt();

        for (int i = 1;i <= count;i++)
        {
            sex = sc.nextInt();
            score1M = sc.nextInt();
            score2F = sc.nextInt();

            //กรณีว่างทั้งสอง
            if (keepedM < keep && keepedF < keep)
            {
                //รับชาย
                if ((score1M >= 9 && sex == 1) || (score1M >= 9 && score2F < 9 && sex == 2))
                {
                    System.out.printf("%d 1\n",i);
                    keepedM++;
                }
                //รับหญิง
                else if ((score2F >= 9 && sex == 2) || (score1M < 9 && score2F >= 9 && sex == 1))
                {
                    System.out.printf("%d 2\n",i);
                    keepedF++;
                }
            }
            //กรณีชายว่างหญิงไม่ว่าง
            else if (keepedM < keep && keepedF == keep && score1M >= 9)
            {
                System.out.printf("%d 1\n",i);
                keepedM++;
            }
            //กรณีหญิงว่างชายไม่ว่าง
            else if (keepedF < keep && keepedM == keep && score2F >= 9)
            {
                System.out.printf("%d 2\n",i);
                keepedF++;
            }
        }
        sc.close();
    }
}