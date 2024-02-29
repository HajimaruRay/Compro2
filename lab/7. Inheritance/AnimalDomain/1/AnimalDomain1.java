package AnimalDomain1;
import java.util.ArrayList;
import java.util.Scanner;

class Animal 
{
    String name;
    int lifeExpect;
    int Age = 0;
    Animal(String name, int lifeExpect)
    {
        this.name = name;
        this.lifeExpect = lifeExpect;
        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
    }

    void live(int year)
    {
        if (Age + year < lifeExpect && isAlive())
        {
            System.out.println(name + " lived " + year + " more years");
            Age += year;
        }
        else if (Age + year == lifeExpect && isAlive())
        {
            System.out.println(name + " lived " + year + " more year");
            Age += year;
        }
        else if (Age + year == lifeExpect && ((year - Age)+1) == 1 && isAlive())
        {
            System.out.println(name + " lived " + year + " more year and died");
            Age += year;
        }
        else if (Age + year == lifeExpect && isAlive())
        {
            System.out.println(name + " lived " + year + " more year and died");
            Age += year;
        }
        else if (Age + year > lifeExpect && isAlive())
        {
            if (year > Age)
            {
                System.out.println(name + " lived " + ((year - Age)+1) + " more years and died");
            }
            else
            {
                System.out.println(name + " lived " + ((Age - year)+1) + " more years and died");
            }
            Age += year;
        }

        else if (!isAlive())
        {
            System.out.println(name + " died earlier");
        }
    }

    boolean isAlive()
    {
        if (Age < lifeExpect)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class AnimalDomain1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Animal> animalarray = new ArrayList<>();
        for(int i = 0; i < N; ++i) 
        {
            int type = scan.nextInt();
            if(type == 1) 
            {
                String name = scan.next();
                int lifeExpect = scan.nextInt();
                animalarray.add(new Animal(name, lifeExpect));
            }
            else if(type == 2) 
            {
                int id = scan.nextInt();
                int year = scan.nextInt();
                animalarray.get(id-1).live(year);
            }
            else if(type == 3) 
            {
                int id = scan.nextInt();
                if (animalarray.get(id-1).isAlive())
                {
                    System.out.println(animalarray.get(id-1).name + " is alive");
                }
                else
                {
                    System.out.println(animalarray.get(id-1).name + " is dead");
                }
                
            }
        }
    }
}