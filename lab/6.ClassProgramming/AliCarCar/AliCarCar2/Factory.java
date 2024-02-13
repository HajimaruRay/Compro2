package AliCarCar2;

public class Factory 
{
    int CarID, ProductionCapacity;
    boolean manufacture[] = null;

    Factory()
    {

    }

    Factory(int CarID, boolean manufacture[], int ProductionCapacity)
    {
        this.CarID = CarID;
        this.ProductionCapacity = ProductionCapacity;
        this.manufacture = new boolean[manufacture.length];
        for (int i = 0;i < manufacture.length;i++)
        {
            this.manufacture[i] = manufacture[i];
        }
    }

    boolean CheckManufacture (int manu)
    {
        // if manu == 1 return true
        if (manu == 1)
        {
            return true;
        }
        // if manu == 1 return false
        else
        {
            return false;
        }
    }

    boolean FactoryAcceptProduct(int ProductformCustommer, int Carlabor)
    {
        //if (manufacture[ProductformCustommer-1] is true && ProductionCapacity - Carlabor >= 0 (Can build))
        if (manufacture[ProductformCustommer] && ProductionCapacity - Carlabor >= 0)
        {
            ProductionCapacity -= Carlabor; //Reduce Capacity because the car was builded
            return true;
        }
        else
        {
            return false;
        }
    }
}
