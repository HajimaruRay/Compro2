public class IronMan extends Skill
{
    IronMan(String name)
    {
        this.name = name;
        WalkSpeed = 10;
        RunSpeed = 20;
        Std = 20;
        damage = attack();
    }

    @Override
    Boolean CanFly()
    {
        return true;
    }

    void printinfo()
    {
        System.out.println(name + " " + WalkSpeed + " " + RunSpeed + " " + Std + " " + CanFly());
    }

    void setWalkSpeed (int WalkSpeed)
    {
        this.WalkSpeed = WalkSpeed;
    }
}
