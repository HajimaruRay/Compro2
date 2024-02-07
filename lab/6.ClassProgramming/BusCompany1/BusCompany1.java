package BusCompany1;
import java.util.Scanner;

class Bus
{
    String BusCode;
    int TypeBus;
    int AllSeat;
    int bookingSeat;
    Boolean IsBusActive;

    Bus (String BusCode, int TypeBus, int AllSeat)
    {
        this.BusCode = BusCode;
        this.TypeBus = TypeBus;
        this.AllSeat = AllSeat;
        bookingSeat = 0;
        IsBusActive = true;
    }

    void printStats()
    {
        System.out.println(BusCode);
        if (TypeBus == 1)
        {
            System.out.println("Fan");
        }
        else if (TypeBus == 2)
        {
            System.out.println("P1");
        }
        else if (TypeBus == 3)
        {
            System.out.println("VIP");
        }
        System.out.println(bookingSeat + " " + AllSeat);
        if (IsBusActive)
        {
            System.out.println("Active");
        }
        else
        {
            System.out.println("Inactive");
        }
    }
}
public class BusCompany1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bus B[] = new Bus[4];
        String BusCode = sc.next();
        int TypeBus = sc.nextInt();
        if (TypeBus == 1)
        {
            int AllSeat = sc.nextInt();
            B[TypeBus] = new Bus(BusCode, TypeBus, AllSeat);
        }
        else if (TypeBus == 2)
        {
            int AllSeat = sc.nextInt();
            B[TypeBus] = new Bus(BusCode, TypeBus, AllSeat);
        }
        else if (TypeBus == 3)
        {
            int AllSeat = sc.nextInt();
            B[TypeBus] = new Bus(BusCode, TypeBus, AllSeat);
        }
        B[TypeBus].printStats();
        sc.close();
    }
}
