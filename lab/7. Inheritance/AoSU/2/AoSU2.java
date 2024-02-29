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

class Team
{
    Hero members[] = new Hero[5];
    Team (Hero members[])
    {
        if (is5MemberTeam(members))
        {
            for (int i = 0;i < 5;i++)
            {
                if (members[i].checkAndWarn())
                {

                }
            }
        }
        else
        {
            return;
        }
    }

    boolean is5MemberTeam (Hero members[])
    {
        if (members == null || members.length < 5)
        {
            System.out.println("member is missing");
            return false;
        }
        else if (members.length == 5)
        {
            System.out.println("full team");
            return true;
        }
        else
        {
            System.out.println("too many members");
            return false;
        }
    }

    boolean isValid (Hero member[])
    {
        String name[] = new String[members.length];

        if (members.length == 5)
        {
            for (int i = 0;i < members.length;i++)
            {
                for (int j = 0;j < name.length;j++)
                {
                    if (members[i].name == name[i])
                    {
                        System.out.println("cannot select same hero: " + members[i].name);
                        
                        return false;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
            System.out.println("valid hero selection");
            return true;
        }
        return false;
    }
}

public class AoSU2
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero members[] = null;
        if(N > 0) 
        {
            members = new Hero[N];
            for(int i = 0; i < N; ++i) 
            {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}