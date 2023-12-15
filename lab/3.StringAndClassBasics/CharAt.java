import java.util.Scanner;

public class CharAt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Text;
        int at = 0;

        Text = sc.nextLine();
        at = sc.nextInt();
        if (at > Text.length() || at <= 0)
        {
            System.out.println("invalid position");
        }
        else
        {
            System.out.println(Text.charAt(at - 1));
        }
        sc.close();
    }
}
