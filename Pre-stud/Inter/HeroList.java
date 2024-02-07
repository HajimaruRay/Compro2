import java.util.Scanner;

public class HeroList
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        IronMan ironman = null;
        Thor thor = null;
        String name = sc.next();
        String name2 = sc.next();
        ironman = new IronMan(name);
        thor = new Thor(name2);

        ironman.printinfo();
        thor.printinfo();

        int WalkSpeed = sc.nextInt();
        ironman.setWalkSpeed(WalkSpeed);

        ironman.printinfo();
        thor.printinfo();


        sc.close();
    }
     
}