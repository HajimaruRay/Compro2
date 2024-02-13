package AliCarCar2;

class Car 
{
	int CarID;
    String name;
    int price;
    int labor;

    //Constructor 
    Car(int CarID, String name, int price, int labor)
    {
        this.CarID = CarID;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }

    //Check all input is correct
    static boolean check (String name, int price, int labor)
    {
        //If name is not empty && price is more than 0 && laber is more than 0
        if (name != null && name.length() != 0 && price > 0 && labor > 0)
        {
            return true;
        }
        else if (name != null && name.length() != 0 && price < 0 && labor < 0)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}