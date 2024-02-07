public class Skill 
{
    String name;
    int WalkSpeed;
    int RunSpeed;
    int Std;
    int damage;

    Boolean CanFly()
    {
        return false;
    }

    int attack()
    {
        return Std * 2;
    }
}
