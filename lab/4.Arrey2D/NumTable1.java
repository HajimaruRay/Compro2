import java.util.Scanner;

public class NumTable1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row+1][col+1];

        for (int r = 1;r <= row;r++)
        {
            for (int c = 1;c <= col;c++)
            {
                arr[r][c] = sc.nextInt();
            }
        }
        int loop = sc.nextInt();

        for (int i = 0;i < loop;i++)
        {
            int InputRow = sc.nextInt();
            int InputCol = sc.nextInt();

            if ((InputRow <= row && row >= 1) && (InputCol <= col && col >= 1))
            {
                System.out.print(arr[InputRow][InputCol]);
            }
            else
            {
                System.out.print("-");
            }
        }
        sc.close();
    }    
}
