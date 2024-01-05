import java.util.Scanner;

public class battleship_set
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arrey[][] = new int[row][col];
        for (int r = 0;r < row;r++)
        {
            for (int c = 0;c < col;c++)
            {
                arrey[r][c] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        System.out.println(k);
        for (int r = 0;r < row;r++)
        {
            for (int c = 0;c < col;c++)
            {
                System.out.print(arrey[r][c] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}