package AliCarCar1;
import java.util.Scanner;

class Car {
	int CarID;
    String name;
    int price;
    int labor;

    Car(int CarID, String name, int price, int labor)
    {
        this.CarID = CarID;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }

    static boolean check (String name, int price, int labor)
    {
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

public class AliCarCar1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int CarID = 1;
		int N = scan.nextInt();
		Car[] cars = new Car[N];
		for(int i = 0; i < N; ++i) 
        {
			String name = scan.next();
			int price = scan.nextInt();
			int labor = scan.nextInt();

			if(Car.check(name, price, labor))
            {
				cars[CarID] = new Car(CarID, name, price, labor);
                CarID++;
				System.out.println("valid");
			} 
			else
            {
				System.out.println("invalid");
			}
		}
	
		for(int i = 1;i < cars.length;i++)
        {
            if (cars[i] != null)
            {
                System.out.println(i + " " + cars[i].name);
            }
        }
        scan.close();
	}
}