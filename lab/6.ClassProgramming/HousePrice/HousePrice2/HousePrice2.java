import java.util.Scanner;

class House 
{
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price;
    House(int landSize, int quality, int floors, int houseArea)
    {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int landSize, int quality, int floors, int houseArea)
    {
        if (quality == 1)
        {
            return ((landSize*10000) + ((floors-1)*200000) + (houseArea*10000));
        }
        else if (quality == 2)
        {
            return ((landSize*10000) + ((floors-1)*200000) + (houseArea*8000));
        }
        else if (quality == 3)
        {
            return ((landSize*10000) + ((floors-1)*200000) + (houseArea*5000));
        }
        return 0;
    }
}

public class HousePrice2
{
 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int landSize, quality, floors, houseArea;
        boolean Isfound = false;
        int n = scan.nextInt();
        House house[] = new House[n];
        for (int i = 0;i < n;i++)
        {
            landSize = scan.nextInt();
            quality = scan.nextInt();
            floors = scan.nextInt();
            houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int MaxPrice = scan.nextInt();
        int MinhouseArea = scan.nextInt();
        for (int i = 0;i < n;i++)
        {
            if (MaxPrice >= house[i].price && MinhouseArea <= house[i].houseArea)
            {
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " +  house[i].houseArea + " " + house[i].price);
                Isfound = true;
            }
        }
        if (!Isfound)
        {
            System.out.println("none");
        }
        scan.close();
    }
}