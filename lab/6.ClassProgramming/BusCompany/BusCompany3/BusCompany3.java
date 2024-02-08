package BusCompany3;
import java.util.Scanner;
class Bus
{
    String BusCode;
    int TypeBus;
    private int AllSeat;
    private boolean bookingSeat[];
    private Boolean IsBusActive;

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
        // int countfalsebooking = 0;
        // for (int i = 0;i < bookingSeat.length;i++)
        // {
        //     if (bookingSeat[i])
        //     {
        //         countfalsebooking++;
        //     }
        // }
        // System.out.println(BusCode);
        // if (TypeBus == 1)
        // {
        //     System.out.println("Fan");
        // }
        // else if (TypeBus == 2)
        // {
        //     System.out.println("P1");
        // }
        // else if (TypeBus == 3)
        // {
        //     System.out.println("VIP");
        // }
        // System.out.println(countfalsebooking + " " + AllSeat);
        // if (IsBusActive)
        // {
        //     System.out.println("Active");
        // }
        // else
        // {
        //     System.out.println("Inactive");
        // }
        System.out.println(BusCode);
    }
}
public class BusCompany3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Bus b[] = new Bus[q];
        for (int i = 0;i < q;i++)
        {
            String id = sc.next();
            int Type = sc.nextInt();
            int seats = sc.nextInt();
            b[i] = new Bus(id, Type, seats);
        }
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            int p = sc.nextInt();
            int k = sc.nextInt();
            int t = sc.nextInt();
            if (p == 1){
                boolean c = false;
                for (int j = 1 ; j <= q ; j ++){
                    if (b[j].TypeBus == t){
                        if (b[j].reserve(k)){
                        b[j].printStats();
                        c = true;
                        break;
                    }
                    }
                    
                }
                if(!c){
                        System.out.println("sorry");
                    }
            }
            else if (p == 2)
            {
                b[t].sendToRepair();
            }
            else if (p == 3)
            {
                b[t].backToService();
            }
        }
        sc.close();
    }
}