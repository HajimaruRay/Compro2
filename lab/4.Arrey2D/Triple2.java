import java.util.Scanner;

public class Triple2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean HaveNumber = false;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int count = 0;
        int check[] = new int[10000];
        

        for (int r = 0;r < row;r++)
        {
            for (int c = 0;c < col;c++)
            {
                arr[r][c] = sc.nextInt();
            }
        }
        int need = sc.nextInt();

        for (int r = 0;r < row;r++)
        {
            for (int c = 0;c < col-2;c++)
            {
                if((arr[r][c] == arr[r][c+1]) && (arr[r][c+1] == arr[r][c+2]) && (arr[r][c] == need))
                {
                    check[count] = c+1;
                    count++;
                    HaveNumber = true;
                }
            }
            if (!HaveNumber)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print(check[0] + " " + check[count-1]);
                HaveNumber = false;
            }
            System.out.println();
            count = 0;
        }
        sc.close();
    }
}
