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


// Do not modify the code below this line. 
public class Pokimon2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        // Read PokiStats
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
        PokiStats stats = new PokiStats(hps, attks, defends);
        
        // Name, level and object creation
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);
        
        // Write output
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());
        scan.close();
    }
}