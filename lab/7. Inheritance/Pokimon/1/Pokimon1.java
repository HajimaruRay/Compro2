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

// Do not modify the code below this line.
public class Pokimon1 
{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    PokiStats[] poki = new PokiStats[N];
        
    // Read inputs for each PokiStats
    int[] hps = new int[6];
    int[] attks = new int[6];
    int[] defends = new int[6];
    for(int i = 0; i < N; ++i) 
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
        poki[i] = new PokiStats(hps, attks, defends);
    }
 
    // Write outputs
    for(int i = 0; i < N; ++i) 
    {
        PokiStats p = poki[i];
        for(int level = 1; level <= 5; ++level)
        {
            System.out.print(p.hps[level] + " ");
        }
        System.out.println();
        
        for(int level = 1; level <= 5; ++level)
        {
           System.out.print(p.attks[level] + " "); 
        }
        System.out.println();
        
        for(int level = 1; level <= 5; ++level)
        {
           System.out.print(p.defends[level] + " "); 
        }
        System.out.println();
    }
    scan.close();
 }
}