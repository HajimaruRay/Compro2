import java.util.Scanner;

public class Underline1 
{
    public void Test()
    {
        System.out.println("--------------------");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Underline1 Te = new Underline1();
        int loop = sc.nextInt();
        String Name[] = new String[loop];
        for (int i = 0;i < loop;i++)
        {
            Name[i] = sc.next();
        }
        for (int i = 0;i < Name.length;i++)
        {
            System.out.println(Name[i]);
            Te.Test();
        }

        sc.close();
    }
}
