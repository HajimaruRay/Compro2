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
    int ProductAmount, SummaryWeight, SummaryPrice;
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
            SummaryPrice += product[i].price * amount[i];
            SummaryWeight += product[i].weight * amount[i];
        }
    }

    void printInfo() 
    {
        System.out.println(ProductAmount + " items = " + SummaryPrice + " baht " + SummaryWeight + " grams");
        for (int i = 0;i < ProductAmount;i++)
        {
            System.out.println(product[i].name + " " + amount[i] + "x" + product[i].price + " = " + amount[i]*product[i].price);
        }
    }
}

public class ProductShipping2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) 
        {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        po.printInfo();
        in.close();
    }
}