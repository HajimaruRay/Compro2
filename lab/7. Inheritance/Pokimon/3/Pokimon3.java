import java.util.Scanner;

class PokiStats 
{
    int hps[] = new int[6];
    int attks[] = new int[6];
    int defends[] = new int[6];

    PokiStats (int[] hps, int[] attks, int[] defends)
    {
        for (int i = 0;i < 6;i++)
        {
            this.hps[i] = hps[i];
        }
        for (int i = 0;i < 6;i++)
        {
            this.attks[i] = attks[i];
        }
        for (int i = 0;i < 6;i++)
        {
            this.defends[i] = defends[i];
        }
    }
}

class Pokimon 
{
    PokiStats stats = null;
    String name;
    int level, energy;

    Pokimon (PokiStats stats, String name, int level)
    {
        this.stats = stats;
        this.energy = stats.hps[level];
        this.name = name;
        this.level = level;
    }

    int attack()
    {
        return stats.attks[level];
    }

    int defend()
    {
        return stats.defends[level];
    }
}

// Edit the following 3 classes to complete the solution.
class WaterPokimon extends Pokimon 
{
    WaterPokimon (PokiStats stats, String name, int level)
    {
        super(stats, name, level);
        this.stats = stats;
    }

    int attack(WaterPokimon opponent)
    {
        return super.attack();
    }

    int attack(FirePokimon opponent)
    {
        return stats.attks[level] * 2;
    }

    int attack(ElectricPokimon opponent)
    {
        return super.attack();
    }
}

class FirePokimon extends Pokimon 
{
    FirePokimon (PokiStats stats, String name, int level)
    {
        super(stats, name, level);
        this.stats = stats;
    }

    int attack(WaterPokimon opponent)
    {
        return super.attack();
    }

    int attack(FirePokimon opponent)
    {
        return super.attack();
    }

    int attack(ElectricPokimon opponent)
    {
        return stats.attks[level] * 2;
    }
}

class ElectricPokimon extends Pokimon 
{
    ElectricPokimon (PokiStats stats, String name, int level)
    {
        super(stats, name, level);
        this.stats = stats;
    }

    int attack(WaterPokimon opponent)
    {
        return stats.attks[level] * 2;
    }

    int attack(FirePokimon opponent)
    {
        return super.attack();
    }

    int attack(ElectricPokimon opponent)
    {
        return super.attack();
    }
}

// Do not modify the code below this line. 
public class Pokimon3 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        // Read PokiStats
        for(int t = 1; t <= 3; ++t) 
        {
            for(int level = 1; level <= 5; ++level)
            {
                hps[level] = scan.nextInt();
            }
            
            for(int level = 1; level <= 5; ++level)
            {
                attks[level] = scan.nextInt();
            }
            for(int level = 1; level <= 5; ++level)
            {
                defends[level] = scan.nextInt();
            }
            PokiStats stats = new PokiStats(hps,attks,defends);

            // Name, level and object creation
            String name = scan.next();
            int level = scan.nextInt();
            if(t == 1)
            {
                water = new WaterPokimon(stats, name, level);
            }
            else if(t == 2)
            {
                fire = new FirePokimon(stats, name, level);
            }
            else if(t == 3)
            {
                electric = new ElectricPokimon(stats, name, level);
            }
        }
        
        // Write output
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " +water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
        scan.close();
    }
}