import java.util.Scanner;

public class Triple1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        

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
            for (int c = 2;c < col;c++)
            {
                if((arr[r][c] == arr[r][c-1]) && (arr[r][c-1] == arr[r][c-2]) && (arr[r][c] == need))
                {
                    System.out.print(r+1 + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
