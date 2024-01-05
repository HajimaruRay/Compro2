import java.util.Scanner;

public class AQIMeaning 
{
    public void AirCheck(int AirPolution)
    {
        if (AirPolution >= 0 && AirPolution <= 50)
        {
            System.out.println("Good");
        }
        else if (AirPolution >= 51 && AirPolution <= 100)
        {
            System.out.println("Moderate");
        }
        else if (AirPolution >= 101 && AirPolution <= 150)
        {
            System.out.println("Unhealthy for Sensitive Groups");
        }
        else if (AirPolution >= 151 && AirPolution <= 200)
        {
            System.out.println("Unhealthy");
        }
        else if (AirPolution >= 201 && AirPolution <= 300)
        {
            System.out.println("Very Unhealthy");
        }
        else if (AirPolution >= 301)
        {
            System.out.println("Hazardous");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AQIMeaning ags = new AQIMeaning();
        int AirPolution = sc.nextInt();
        ags.AirCheck(AirPolution);
        sc.close();
    }    
}
