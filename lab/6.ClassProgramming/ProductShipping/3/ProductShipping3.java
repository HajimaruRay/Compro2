import java.util.Scanner;

class Product 
{
    String name;
    int weight; //g
    int price; //Bath

    Product (String name, int weight, int price)
    {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo ()
    {
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}

class PurchaseOrder {
    int ProductAmount, weight, price;
    int amount[];
    Product product[];

    PurchaseOrder (int n, Product product[], int amount[])
    {
        this.ProductAmount = n;
        this.product = new Product[n];
        this.amount = new int[n];
        for (int i = 0;i < n;i++)
        {
            this.amount[i] = amount[i];
            this.product[i] = product[i];
            price += product[i].price * amount[i];
            weight += product[i].weight * amount[i];
        }
    }

    void printInfo() 
    {
        System.out.println(ProductAmount + " items = " + price + " baht " + weight + " grams");
        for (int i = 0;i < ProductAmount;i++)
        {
            System.out.println(product[i].name + " " + amount[i] + "x" + product[i].price + " = " + amount[i]*product[i].price);
        }
    }
}

class Truck 
{
    int capacity, netWeight, Destination;
    double ShippingCost;

    Truck (int capacity)
    {
        this.netWeight = capacity;
        this.capacity = capacity;
        this.Destination = 0;
        this.ShippingCost = 0;
    }

    void add (PurchaseOrder po, int Destination)
    {
        this.Destination = Destination;
        this.netWeight = po.weight;
        setFee();
    }

    void setFee ()
    {
        ShippingCost = (netWeight/1000.00) * Destination;
    }

    double getFee ()
    {
        return Double.parseDouble(String.format((Math.abs(ShippingCost * 100) % 10 == 0) ? "%.2f" : "%.3f", ShippingCost));
    }
}

public class ProductShipping3 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i=0;i<m;i++)
        {
            int capacity = in.nextInt();
            trucks[i] = new Truck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for(int i=0;i<n;i++)
        {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name,weight,price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n,products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0;i<m;i++)
        {
            if((trucks[i].netWeight>=po.weight)&&(minvalue>trucks[i].netWeight))
            {
                minvalue = trucks[i].netWeight;
                minIndex = i;
            }
        }
        if (minIndex >= 0)
        {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#"+ (minIndex+1));
            System.out.println("Fee="+ trucks[minIndex].getFee());
        }
        else
        {
            System.out.println("No truck");
            System.out.println("Fee="+ po.weight*dest/1000.0);
        }
        in.close();
    }
}