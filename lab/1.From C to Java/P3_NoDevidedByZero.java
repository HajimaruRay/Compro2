import java.util.Scanner;

public class P3_NoDevidedByZero 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        Double z = sc.nextDouble();
        
        if (z == 0)
        {
            System.out.println("cannot divide by zero");
        }
        else
        {
            System.out.printf("%.6f",(x+y)/z);
        }
        sc.close();
    }  
}
