import java.util.Scanner;
import java.util.ArrayList;

class Jaeger
{
    private String name = "", CoO;
    private int mark = 0;
    private double h = 0.0;
    private ArrayList<String> strp = new ArrayList<>();
    private ArrayList<String> strw = new ArrayList<>();
    Jaeger ()
    {
        this.CoO = "Unknown";
    }
    Jaeger (String name)
    {
        this.name = name;
        this.CoO = "Unknown";
    }
    Jaeger (String name, String CoO, int mark, double h, String strp[], String strw[])
    {
        this.name = name;
        if (CoO.length() > 0)
        {
            this.CoO = CoO;
        }
        else
        {
            this.CoO = "";
        }
        
        this.mark = mark;
        this.h = h;
        for (int i = 0;i < strp.length;i++)
        {
            this.strp.add(strp[i]);
        }
        for (int i = 0;i < strw.length;i++)
        {
            this.strw.add(strw[i]);
        }
    }

    void PrintDetail()
    {
        if (name.length() > 0)
        {
            System.out.println("Jaegers : " + name);
        }
        else
        {
            System.out.println("Jaegers : Unknown");
        }
        System.out.println("< Country of Origin: " + CoO + " >");
        if (mark > 0)
        {
            System.out.println("< Mark: Mark-" + mark + " >");
        }
        else
        {
            System.out.println("< Mark: Unknown >");
        }

        if (h > 0.0)
        {
            System.out.println("Height: " + h + " meters");
        }
        else
        {
            System.out.println("Height: Unknown");
        }

        if (strp.size() > 0)
        {
            System.out.println("Pilots: [" + strp.size() + "] :");
            for (int i = 0;i < strp.size();i++)
            {
                System.out.println(strp.get(i));
            }
        }
        else
        {
            System.out.println("Pilots: Unknown");
        }

        if (strw.size() > 0)
        {
            System.out.println("Weapons: [" + strw.size() + "] :");
            for (int i = 0;i < strw.size();i++)
            {
                System.out.println(strw.get(i));
            }
        }
        else
        {
            System.out.println("Weapons: Unknown");
        }
    }
}

class Kaiju
{
    String name = "", Category = "",Description = "";
    int Height = 0, Weight = 0;
    ArrayList<String> power = new ArrayList<>();
    Kaiju ()
    {
        
    }
    Kaiju (String name)
    {
        this.name = name;
    }
    Kaiju (String name, String Category, int Height, int Weight, String power[], String Description)
    {
        this.name = name;
        this.Category = Category;
        this.Height = Height;
        this.Weight = Weight;
        for (int i = 0;i < power.length;i++)
        {
            this.power.add(power[i]);
        }
        this.Description = Description;
    }

    void PrintDetail()
    {
        if (name.length() > 0)
        {
            System.out.println("Kaiju : " + name);
        }
        else
        {
            System.out.println("Kaiju : Unknown");
        }

        if (Category.length() > 0)
        {
            System.out.println("< Category: Category " + Category + " >");
        }
        else
        {
            System.out.println("< Category: Category Unknown >");
        }

        if (Height > 0)
        {
            System.out.println("Height: " + Height + " feet (" + Height/3.2808 + " meters)");
        }
        else
        {
            System.out.println("Height: Unknown");
        }

        if (Weight > 0)
        {
            System.out.println("Weight: " + Weight + " tons");
        }
        else
        {
            System.out.println("Weight: Unknown");
        }

        if (power.size() > 0)
        {
            System.out.println("Power: [" + power.size() + "] :");
            for (int i = 0;i < power.size();i++)
            {
                System.out.println(power.get(i));
            }
        }
        else
        {
            System.out.println("Power: Unknown");
        }

        if (Description.length() > 0)
        {
            System.out.println("Description: " + Description);
        }
        else
        {
            System.out.println("Description: Unknown");
        }
    }
}

public class PacificRim {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;

        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }

        int typeJ = sc.nextInt();
        
        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();        
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }
        
        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
        sc.close();
    }
}