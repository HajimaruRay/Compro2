import java.util.Scanner;

public class LengthOfKiteString
{
    public static double EllipticalPerimeter(double a, double b)
    {
        return Math.PI*((3.0/2.0)*(a+b)-Math.sqrt(a*b));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double perimeter = EllipticalPerimeter(h, w);
        String answer = String.format("Length of Kite is %.2f",1.0/4.0*perimeter);
        System.out.println(answer);
        sc.close();
    }
}