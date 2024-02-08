import java.util.Scanner;

class  ZooTicket1
{
    String Name;
    int price = 100;
    boolean IsRidebook = false;
    boolean IsSealbook = false;
    boolean IsTigerbook = false;

    ZooTicket1(String Name)
    {
        this.Name = Name;
    }

    boolean UseRide()
    {
        if (IsRidebook)
        {
            System.out.println("okay");
            IsRidebook = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }

    boolean enterSealShow()
    {
        if (IsSealbook)
        {
            System.out.println("okay");
            IsSealbook = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }
    boolean enterTigerShow()
    {
        if (IsTigerbook)
        {
            System.out.println("okay");
            IsTigerbook = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
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


public class ZooTicket2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        ZooTicket1 ZT = new ZooTicket1(Name);
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
        ZT.summarize();
        int q = sc.nextInt();
        int WhatTheyWantTo[] = new int[q]; 
        for (int i = 0;i < q;i++)
        {
            WhatTheyWantTo[i] = sc.nextInt();
            if (WhatTheyWantTo[i] == 1)
            {
                System.out.println(ZT.UseRide());
            }
            else if (WhatTheyWantTo[i] == 2)
            {
                System.out.println(ZT.enterSealShow());
            }
            else if (WhatTheyWantTo[i] == 3)
            {
                System.out.println(ZT.enterTigerShow());
            }
        }
        sc.close();
    }
}