package BusCompany2;
import java.util.Scanner;

class Bus
{
    String BusCode;
    int TypeBus;
    int AllSeat;
    boolean bookingSeat[];
    Boolean IsBusActive;

    Bus (String id, int Type, int Seat)
    {
        this.BusCode = id;
        this.TypeBus = Type;
        this.AllSeat = Seat;
        IsBusActive = true;
        this.bookingSeat = new boolean[AllSeat];
        for (int i = 0;i < bookingSeat.length;i++)
        {
            bookingSeat[i] = false;
        }
    }

    boolean reserve(int k)
    {
        int countfalse = 0;
        for (int i = 0;i < bookingSeat.length;i++)
        {
            if (!bookingSeat[i])
            {
                countfalse++;
            }
        }

        if (k <= 0)
        {
            return false;
        }
        else if (k > countfalse)
        {
            return false;
        }
        else if (!IsBusActive)
        {
            return false;
        }
        else
        {
            int count = 0;
            for (int i = 0;i < bookingSeat.length;i++)
            {
                if (bookingSeat[i])
                {
                    count++;
                }
            }
            for (int i = count;i < k+count;i++)
            {
                bookingSeat[i] = true;
            }
            
            return true;
        }
    }

    void sendToRepair()
    {
        IsBusActive = false;
    }
    
    void backToService()
    {
        IsBusActive = true;
    }

    void printStats()
    {
        int countfalsebooking = 0;
        for (int i = 0;i < bookingSeat.length;i++)
        {
            if (bookingSeat[i])
            {
                countfalsebooking++;
            }
        }
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
        System.out.println(countfalsebooking + " " + AllSeat);
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
public class BusCompany2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
    
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) 
        {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if(P == 1)
            {
                b.reserve(K);
            }   
            else if(P == 2)
            {
                b.sendToRepair();
            } 
            else if(P == 3)
            {
                b.backToService();
            } 
            b.printStats();
        }
        scan.close();
    }
}