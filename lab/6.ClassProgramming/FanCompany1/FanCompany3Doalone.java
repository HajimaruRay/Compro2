import java.util.Scanner;

class ElectricFan
{
    Blade ablade = null;
    Motor motor = null;
    int productID;
    boolean status = false;
    static int count = 1;
    ElectricFan (Blade ablade,Motor moter)
    {
        this.productID = count++;
        this.ablade = ablade;
        this.motor = moter;

        if (motor.horsepower() >= ablade.hp)
        {
            this.status = true;
        }
        else
        {
            this.status = false;
        }
    }

    void changeBlade(Blade aBlade)
    {
        this.ablade = aBlade;
        if (motor.horsepower() >= ablade.hp)
        {
            this.status = true;
        }
        else
        {
            this.status = false;
        }
    } 

    void changeMotor(Motor motor)
    {
        this.motor = motor;
        double hp = motor.horsepower();
        if (hp >= ablade.hp)
        {
            this.status = true;
        }
        else
        {
            this.status = false;
        }
    }

    void printInfo()
    {
        double hp = motor.horsepower();
        System.out.println(productID + " " + ablade.size + " " + ablade.hp + " " + motor.I + " " + String.format("%.2f", hp) + " " + status);
    }
}

public class FanCompany3Doalone
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size,numb,angle;
        double hp,v,i,eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan= null;
        for(int index=0;index<n;index++)
        {
            int cmd = sc.nextInt();
            if (cmd==0)
            {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp); 
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan = new ElectricFan(ablade,motor);
            }
            else if (cmd==1)
            {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                eFan.changeBlade(ablade);
            }
            else if(cmd==2)
            {
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
        sc.close();
    }
}