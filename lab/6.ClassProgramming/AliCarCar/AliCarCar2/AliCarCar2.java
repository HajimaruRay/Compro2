package AliCarCar2;
import java.util.Scanner;

public class AliCarCar2 
{
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);

        // {
        //     CarZone
        // }
        int CarID = 1; //Create var for keep correct car count
		int N = scan.nextInt(); //Input N for know how much car brand'll come
		Car[] cars = new Car[N]; //Create array Car
		for(int i = 0; i < N; ++i)  //loop for input
        {
            String name = scan.next(); //input name
			int price = scan.nextInt(); //input price
			int Carlabor = scan.nextInt(); //input laber (CanCreate)
            
            //Check in function if "true" right it'll keep in array cars
			if(Car.check(name, price, Carlabor))
            {
                cars[CarID] = new Car(CarID, name, price, Carlabor); //keep in array cars
                CarID++; //Count CarID for print in future
			}
		}

        // {
        //     Factory Zone
        // }
        Factory factory[] = new Factory[5]; //Create Factory object
        
        for (int i = 0;i < factory.length;i++)
        {
            factory[i] = new Factory();
            boolean manufacture[] = new boolean[N]; //Create boolean manufacture
            int manu; //Create manu 
            int ProductionCapacity = scan.nextInt(); // create and input production capacity
            //loop for input manufacture
            for (int j = 0;j < N;j++)
            {
                manu = scan.nextInt(); //Input manu (manu is keep factory can build that "correct" car not can build all input car)
                // sent manu to method CheckManufacture in function factory and return boolean and keepit in manufacture
                manufacture[j] = factory[i].CheckManufacture(manu);
            }
            //Sent CarID manufacture and productionCapacity to constructor
            factory[i] = new Factory(CarID, manufacture, ProductionCapacity);
        }

        // {
        //      Production Zone
        // }
        int custommer = scan.nextInt(); //Input How many Custommer 
        int ProductformCustommer; //Create ProductformCustommer
        int factoryAccept = -1; //Create factoryAccept for keep number of factory where accept productformCustommer
        for (int i = 0;i < custommer;i++)
        {
            ProductformCustommer = scan.nextInt(); //input productformCustommer
            //Check if 0 < ProductformCustommer < CarID
            if (ProductformCustommer < CarID)
            {
                //loop check what factory can accept this product
                for (int j = 0;j < factory.length;j++)
                {
                    //sent ProductformCustommer-1 (ProductformCustommer is real number) and cars[ProductformCustommer].labor
                    if (factory[j].FactoryAcceptProduct(ProductformCustommer-1, cars[ProductformCustommer].labor))
                    {
                        factoryAccept = j+1; //factoruAccept == loop j
                        break;
                    }
                }
                // if factoryAccept isn't update it'll no factory accepted
                if (factoryAccept == -1)
                {
                    System.out.println("unable to build");
                }
                else
                {
                    System.out.println("okay " + factoryAccept);
                    factoryAccept = -1;
                }
            }
            else
            {
                System.out.println("invalid model");
            }
        }
		
        scan.close();
	}
}