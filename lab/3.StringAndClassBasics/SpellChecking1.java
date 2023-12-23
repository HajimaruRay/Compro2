import java.util.Scanner;

public class SpellChecking1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int directoryNo = sc.nextInt();
        int result[] = new int[10];
        String directory[] = new String[directoryNo];
        String TextCheck[] = new String[10];
        
        for (int i = 0;i < directory.length;i++)
        {
            directory[i] = sc.next();
        }
        for (int i = 0;i < 10;i++)
        {
            TextCheck[i] = sc.next();
        }

        for (int i = 0; i < TextCheck.length; i++) 
        {
            for (int j = 0; j < directory.length; j++) 
            {

                if (directory[j].equals(TextCheck[i]) == true) 
                {
                    result[i]++;
                    break;
                }
            }
        }
        for (int i = 0;i < result.length;i++)
        {
            System.out.print(result[i]);
        }
        sc.close();
    } 
}
