import java.util.Scanner;

class P1_Last_digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        number = number % 10;
        number = number % 10;

        System.out.println(number);
        sc.close();
    }
}