package ZooTicket1;
import java.util.Scanner;

class  ZooTicket
{
    String Name;
    int price = 100;
    boolean IsRidebook = false;
    boolean IsSealbook = false;
    boolean IsTigerbook = false;

    ZooTicket(String Name)
    {
        this.Name = Name;
    }

    void bookRide()
    {
        IsRidebook = true;
        price += 40;
    }

    void bookSealShow()
    {
        IsSealbook = true;
        price += 50;
    }

    void bookTigerShow()
    {
        IsTigerbook = true;
        price += 65;
    }

    void summarize()
    {
        System.out.println(Name);
        if (IsRidebook)
        {
            System.out.println("Ride");
        }
        if (IsSealbook)
        {
            System.out.println("Seal");
        }
        if (IsTigerbook)
        {
            System.out.println("Tiger");
        }
        System.out.println(price);
    }
}


public class ZooTicket1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        ZooTicket ZT = new ZooTicket(Name);
        int booking[] = new int[5];
        for (int i = 0;;i++) 
        {
            booking[i] = sc.nextInt();
            if (booking[i] == 0)
            {
                break;
            }
            else if (booking[i] == 1)
            {
                ZT.bookRide();
            }
            else if (booking[i] == 2)
            {
                ZT.bookSealShow();
            }
            else if (booking[i] == 3)
            {
                ZT.bookTigerShow();
            }
        }
        sc.close();
        ZT.summarize();
    }
}