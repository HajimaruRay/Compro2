import java.util.Scanner;

class Blade
{
    int size;
    int numb;
    int angle;
    double hp;
    boolean valid = false;
    int check = 0;
    
    Blade(int size,int numb,int angle,double hp)
    {
        if (size >= 16 && size <= 24 && size % 2 == 0)
        {
            this.size = size;
            check++;
        }
        else
        {
            this.size = size;
            System.out.println("invalid size");
        }
        if (numb >= 3 && numb <= 5)
        {
            this.numb = numb;
            check++;
        }
        else
        {
            this.numb = numb;
            System.out.println("invalid number of blades");
        }
        if (angle == 27 || angle == 30 || angle == 33)
        {
            this.angle = angle;
            check++;
        }
        else
        {
            this.angle = angle;
            System.out.println("invalid angle");
        }
        if (hp > 0)
        {
            this.hp = hp;
            check++;
        }
        else
        {
            this.hp = hp;
            System.out.println("invalid horsepower");
        }

        if (check == 4)
        {
            valid = true;
        }
    }

    void printInfo()
    {
        System.out.println(size + " " + numb + " " + angle + " " + hp + " " + valid);
    }
}

class Motor
{
    double V,I,eff;

    Motor(double V,double I, double eff)
    {
        this.V = V;
        this.I = I;
        this.eff = eff/100;
    }
    Motor(double I,double eff)
    {
        this(220, I, eff);
    }
    double horsepower()
    {
        return (V * I * eff) / 746;
    }

    void printInfo()
    {
        double hp = horsepower();
        System.out.println(V + " " + I + " " + eff +" " + String.format("%.2f", hp));
    }
}


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

public class FanCompany3Send
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