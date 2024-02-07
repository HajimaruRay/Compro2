public class Thor extends Skill 
{
    Thor(String name)
    {
        this.name = name;
        WalkSpeed = 10;
        RunSpeed = 20;
        Std = 20;
        damage = attack();
    }

    void printinfo()
    {
        System.out.println(name + " " + WalkSpeed + " " + RunSpeed + " " + Std + " " + CanFly());
    }
}
