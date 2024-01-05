import java.util.Scanner;

public class BgReport_rev2 
{
    public void Bio(String Name, int DateBirth, int DateWork)
    {
        Boolean IsBirthTrue = false;
        if (Name.length() >= 2)
        {
            System.out.println("Name: " + Name);
        }
        else
        {
            System.out.println("Name: INVALID");
        }
        
        if (1900 <= DateBirth && DateBirth < 2022)
        {
            System.out.println("Birth year: " + DateBirth);
            IsBirthTrue = true;
        }
        else
        {
            System.out.println("Birth year: INVALID");
        }

        if ((DateWork - DateBirth < 18) || !IsBirthTrue || (1900 > DateWork || DateWork > 2022))
        {
            System.out.println("Start year: INVALID");
        }
        else
        {
            System.out.println("Start year: " + DateWork);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BgReport_rev2 BioData = new BgReport_rev2();
        String Name = sc.next();
        int Birth = sc.nextInt();
        int Work = sc.nextInt();
        BioData.Bio(Name, Birth, Work);
        sc.close();
    }
}
