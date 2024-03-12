import java.util.Scanner;

public class BaseConverter 
{

 String convertBase(int decimal, int base) 
 {
    String result = "";

    if (decimal == 0)
    {
        return result;
    }
    else
    {
        result = convertBase(decimal/base, base) + decimal%base;
        return result;
    }
 }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = sc.nextInt();
        int base = sc.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
        sc.close();
    }
}