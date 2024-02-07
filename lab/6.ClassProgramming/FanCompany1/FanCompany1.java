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

public class FanCompany1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numb = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
        scan.close();
    }
}
