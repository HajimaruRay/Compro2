import java.util.Scanner;

public class CovidScreening
{
    public void CovidCheck(int Guarantee, int LevelOfCovid, int Age, int Vaccine)
    {
        if (Guarantee == 1)
        {
            System.out.println("RT-PCR recommended");
        }

        if (LevelOfCovid < 3 && Age < 70)
        {
            System.out.println("Home isolation");
        }
        else if (LevelOfCovid == 3 || Age >= 70)
        {
            System.out.println("Hospital admission");
        }

        if (LevelOfCovid > 1 || Vaccine < 1)
        {
            System.out.println("Favipiravia included");
        }
        else
        {
            System.out.println("Standard medicine package");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CovidScreening CS = new CovidScreening();
        int Guarantee = sc.nextInt();
        int LevelOfCovid = sc.nextInt();
        int Age = sc.nextInt();
        int Vaccine = sc.nextInt();
        CS.CovidCheck(Guarantee, LevelOfCovid, Age, Vaccine);
        
        sc.close();
    }    
}
