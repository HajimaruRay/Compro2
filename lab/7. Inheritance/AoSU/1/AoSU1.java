import java.util.Scanner;
class Hero
{
    String name = null;
    int hp = 0, phyatt = 0, phydef = 0, magatt = 0, magdef = 0;

    Hero (String name, int hp, int type,int att, int phydef, int magdef)
    {
        this.name = name;
        this.hp = hp;
        if (type == 1)
        {
            this.phyatt = att;
        }
        else if (type == 2)
        {
            this.magatt = att;
        }
        this.phydef = phydef;
        this.magdef = magdef;
        checkAndWarn();
    }

    void printInfo ()
    {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        if (phyatt != 0 && magatt == 0)
        {
            System.out.println("Attack: " + phyatt + " (physical)");
        }
        else if (phyatt == 0 && magatt != 0)
        {
            System.out.println("Attack: " + magatt + " (magical)");
        }
        System.out.println("Defense: " + phydef + " (physical), " + magdef + " (magical)");
        checkAndWarn();
    }

    boolean checkAndWarn ()
    {
        if (hp < 0 || phyatt < 0 || magatt < 0 || phydef < 0 || magdef < 0)
        {
            System.out.println("warning: value cannot be negative");
            return false;
        }
        return true;
    }
}

public class AoSU1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int hp = scan.nextInt();
        int attkType = scan.nextInt();
        int attkDmg = scan.nextInt();
        int phyDef = scan.nextInt();
        int magDef = scan.nextInt();
        
        Hero hero = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
        hero.printInfo();
        System.out.println(hero.checkAndWarn());
        scan.close();
    }
       
}