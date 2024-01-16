import java.util.Scanner;

class Theater1
{
    int numSeats;
    int basePrice;

    boolean threeD;
    boolean luxury;
    boolean IsSeatFull = false;
    boolean Seats[];

    String title;
    Theater1 (boolean threeD, boolean luxury, int numSeats)
    {
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        Seats = new boolean[numSeats+1];
    }
    
    void setTitle(String title)
    {
        if (title == null || title.length() == 0 || title.equalsIgnoreCase("-1"))
        {
            System.out.println("invalid title");
        }
        else
        {
            this.title = title;
        }
    }

    void setBasePrice(int basePrice)
    {
        if (basePrice <= 0)
        {
            System.out.println("invalid price");
            basePrice = -1;
        }
        else
        {
            this.basePrice = basePrice;
        }
    }

    int reserveOne(int seatNumber)
    {
        if (seatNumber < Seats.length && seatNumber > 0)
        {
            if (!Seats[seatNumber])
            {
                Seats[seatNumber] = true;
                return basePrice;
            }
            else
            {
                System.out.println("sorry");
                return -1;
            }
        }
        else
        {
            System.out.println("sorry");
            return -1;
        }
    }

    int reserveMultiple(int numberOfSeats, int seatNumber)
    {
        if (seatNumber > 0 && seatNumber+(numberOfSeats-1) < Seats.length)
        {
            for (int i = seatNumber;i < seatNumber+numberOfSeats;i++)
            {
                if (Seats[i])
                {
                    IsSeatFull = true;
                    break;
                }
            }
        }
        else
        {
            System.out.println("sorry");
            IsSeatFull = false;
            return -1;
        }

        if (IsSeatFull)
        {
            System.out.println("sorry");
            IsSeatFull = false;
            return -1;
        }
        else
        {
            int sumprice = 0;
            IsSeatFull = false;
            for (int i = seatNumber;i < seatNumber+numberOfSeats;i++)
            {
                Seats[i] = true;
                sumprice += basePrice;
            }
            System.out.println(sumprice);
            return 0;
        }
    }

    void printInfo()
    {
        if (threeD)
        {
            System.out.println("3D");
        }
        else
        {
            System.out.println("No 3D");
        }

        if (luxury)
        {
            System.out.println("Luxury");
        }
        else
        {
            System.out.println("Standart");
        }

        System.out.println(Seats.length - 1);

        if (title == null)
        {
            System.out.println("title is not set");
        }
        else
        {
            System.out.println(title);
        }

        if (basePrice == -1)
        {
            System.out.println("price is not set");
        }
        else
        {
            System.out.println(basePrice);
        }
    }
}
// Do not modify the code below. You must leave it as is.
public class Theater2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
        {
            threeD = true;
        }
        if(luxury1 == 1)
        {
            luxury = true;
        }
        Theater1 t = new Theater1(threeD, luxury, numSeats);
        scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) 
        {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if(numberOfSeats == 1)
            {
                totalPrice = t.reserveOne(seatNumber);
            }
            else
            {
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            }
            if(totalPrice > 0)
            {
                System.out.println(totalPrice);
            }
        }
        t.printInfo();
        scan.close();
    }
}