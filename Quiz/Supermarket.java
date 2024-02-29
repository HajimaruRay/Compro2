import java.util.ArrayList;
import java.util.Scanner;

class FruitSection 
{
    ArrayList<Basket> arr_b = new ArrayList<Basket>();
    int MaxPrice, MaxWeight, Income;

    FruitSection(int P, int W)
    {
        MaxPrice = P;
        MaxWeight = W*1000;
    }

    boolean check(Basket B)
    {
        if ((B.AllPrice >= 500 && B.AllPrice <= MaxPrice) && (B.Weight >= 2000 && B.Weight <= MaxWeight) && (B.type >= 3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void addBasket(Basket B)
    {
        if (check(B))
        {
            arr_b.add(B);
        }
    }

    void  printBasket(int n)
    {
        if (n >= 0 && n < arr_b.size())
        {
            System.out.print(arr_b.get(n).grape_Count + " " + arr_b.get(n).melon_Count+ " " + arr_b.get(n).apple_Count + " " + arr_b.get(n).cherry_Count + " " + arr_b.get(n).pear_Count + " " + arr_b.get(n).kiwi_Count);
            System.out.print(", " + arr_b.get(n).AllPrice + " " + arr_b.get(n).Weight + " " + arr_b.get(n).type);
            System.out.println();
        }
        else
        {
            System.out.println("invalid");
        }
    }

    void printAvailable()
    {
        if (arr_b.size() > 0)
        {
            for (int i = 0;i < arr_b.size();i++)
            {
                printBasket(i);
            }
        }
        else
        {
            System.out.println("nothing to sell");
        }
    }

    void sellBasket(int m)
    {
        if (m >= 0 && m < arr_b.size())
        {
            System.out.println("sell basket " + (m+1) + " " + arr_b.get(m).AllPrice);
            Income += arr_b.get(m).AllPrice;
            arr_b.remove(m);
        }
        else
        {
            System.out.println("invalid");
        }
    }
}

class Basket 
{
    int grape_Count, melon_Count, apple_Count, cherry_Count, pear_Count, kiwi_Count;
    int AllPrice, Weight, type;

    Basket(int grape_Count, int melon_Count, int apple_Count, int cherry_Count, int pear_Count, int kiwi_Count)
    {
        this.grape_Count = grape_Count;
        this.melon_Count = melon_Count;
        this.apple_Count = apple_Count;
        this.cherry_Count = cherry_Count;
        this.pear_Count = pear_Count;
        this.kiwi_Count = kiwi_Count;

        AllPrice = (grape_Count * 120) + (melon_Count * 200) + (apple_Count * 90) + (cherry_Count * 180) + (pear_Count * 60) + (kiwi_Count * 150);
        Weight = (grape_Count * 500) + (melon_Count * 2000) + (apple_Count * 300) + (cherry_Count * 350) + (pear_Count * 400) + (kiwi_Count * 500);
        type = positiveToOne(grape_Count, melon_Count, apple_Count, cherry_Count, pear_Count, kiwi_Count);
    }

    int positiveToOne(int grape_Count, int melon_Count, int apple_Count, int cherry_Count, int pear_Count, int kiwi_Count) 
    {
        int count = 0;
        if (grape_Count != 0) count++;
        if (melon_Count != 0) count++;
        if (apple_Count != 0) count++;
        if (cherry_Count != 0) count++;
        if (pear_Count != 0) count++;
        if (kiwi_Count != 0) count++;
        return count;
    }
}

public class Supermarket 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int W = sc.nextInt();
        FruitSection fs = new FruitSection(P, W);
        while (true) 
        {
            int grape = sc.nextInt();
            int melon = sc.nextInt();
            int apple = sc.nextInt();
            int cherry = sc.nextInt();
            int pear = sc.nextInt();
            int kiwi = sc.nextInt();
            Basket b = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if(b.type==0)
            {
                break;
            }
            else
            {
                fs.addBasket(b);
            }
        }
        while (true) 
        {
            String command = sc.next();
            if (command.equals("stop"))
            {
                System.out.println("income: " + fs.Income);
                break;
            }
            if (command.equals("printAll"))
            {
                fs.printAvailable();
            }
            if (command.equals("print"))
            {
                int n = sc.nextInt() - 1;
                fs.printBasket(n);
            }
            if (command.equals("sell"))
            {
                int m = sc.nextInt() - 1;
                fs.sellBasket(m);
            }
        }
        sc.close();
    }
}