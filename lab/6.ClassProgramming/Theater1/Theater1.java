import java.util.Scanner;

class Theater
{
    boolean Is3D;
    boolean IsLux;
    int Seat;
    String MName;
    int TicketPrice;

    String title;
    int basePrice = 0;

    Theater (int Is3D, int IsLux, int Seat, String MName, int TicketPrice)
    {
        if (Is3D == 1)
        {
            this.Is3D = true;
        }
        if (IsLux == 1)
        {
            this.IsLux = true;
        }
        this.Seat = Seat+1;
        this.MName = MName;
        this.TicketPrice = TicketPrice;
    }
    boolean IsSeatEmt[] = new boolean[Seat];

    void setTitle (String MName)
    {
        if (MName == null || MName.isEmpty() || (MName.matches(".*\\d.*") && MName.length() < 3))
        {
            System.out.println("invalid title");
        }
        else
        {
            title = MName;
        }
    }

    void setBasePrice(int TicketPrice)
    {
        if (TicketPrice <= 0)
        {
            System.out.println("invalid price");
        }
        else
        {
        basePrice = TicketPrice;
        }
    }

    void printInfo()
    {
        if (Is3D)
        {
            System.out.println("3D");
        }
        else
        {
            System.out.println("No 3D");
        }
        if (IsLux)
        {
            System.out.println("Luxury");
        }
        else
        {
            System.out.println("Standard");
        }
        System.out.println(Seat - 1);
        if (title == null)
        {
            System.out.println("title is not set");
        }
        else
        {
            System.out.println(title);
        }
        if (basePrice <= 0)
        {
            System.out.println("price is not set");
        }
        else
        {
            System.out.println(basePrice);
        }
    }
}

public class Theater1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Is3D = sc.nextInt();
        int IsLux = sc.nextInt();
        int Seat = sc.nextInt();
        sc.nextLine();
        String MName = sc.nextLine();
        int TicketPrice = sc.nextInt();
        sc.close();

        Theater th = new Theater(Is3D, IsLux, Seat, MName, TicketPrice);
        th.setTitle(MName);
        th.setBasePrice(TicketPrice);
        th.printInfo();
    }
}