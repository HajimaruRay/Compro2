import java.util.Scanner;

public class NumTable2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int lastNumber = -1;
        boolean isSpace = false;
        boolean isFirst = true;
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

            if ((InputRow <= row && InputRow >= 1) && (InputCol <= col && InputCol >= 1))
            {
                if (arr[InputRow][InputCol] != lastNumber){
                    System.out.print(arr[InputRow][InputCol]);
                    lastNumber = arr[InputRow][InputCol];
                    isSpace = false;
                    isFirst = false;
                }
                else if (lastNumber == arr[InputRow][InputCol]){
                    System.out.print("*");
                }
            }
            else if (!isSpace && !isFirst)
            {
                lastNumber = -1;
                System.out.println();
                isSpace = true;
                isFirst = false;
            }
        }
        sc.close();
    }    
}
