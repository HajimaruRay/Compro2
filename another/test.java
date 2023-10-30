import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int row,col;
        
        row = scanner.nextInt();
        col = scanner.nextInt();
        
        int fixcol = col;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col || i == j || j == fixcol)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                } 
            }
            fixcol--;
            System.out.println();
        }
        scanner.close();
    }
}