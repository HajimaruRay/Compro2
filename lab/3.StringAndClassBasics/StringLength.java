import java.util.Scanner;

public class StringLength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String Text = sc.nextLine();
        System.out.println(Text.length());
        sc.close();
    }
}