import java.util.Scanner;

class TaoKlingOrder
{
    String phoneNo, code;
    int n1, n2, n3;
    int numMilk = 0, numJuice = 0, numMineralWater = 0, total = 0;
    boolean completed = false;
    TaoKlingOrder (String phoneNo, int n1, int n2, int n3,String code)
    {
        this.code = code;
        if (phoneNo.length() == 10 && phoneNo.charAt(0) == '0')
        {
            this.phoneNo = phoneNo;
        }
        else
        {
            System.out.println("invalid phone number");
            this.phoneNo = "0#########";
        }

        if (n1 > 0)
        {
            this.numMilk = n1;
            this.total += n1 * 10;
        }
        if (n2 > 0)
        {
            this.numJuice = n2;
            this.total += n2 * 20;
        }
        if (n3 > 0)
        {
            this.numMineralWater = n3;
            this.total += n3 * 15;
        }
    }

    boolean grabOrder(String phone, String code1)
    {
        if (phone.equals(phoneNo) && code.equals(code1))
        {
            completed = true;
            return completed;
        }
        else
        {
            return completed;
        } 
    }

    void printInfo()
    {
        char Isgave;
        if (completed)
        {
            Isgave = 'Y';
        }
        else
        {
            Isgave = 'N';
        }
        
        System.out.println(phoneNo + " " + numMilk + " " + numJuice + " " + numMineralWater + " " + total + " " + Isgave);
    }
}
public class TaoKling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String code = sc.next();
        TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1,n2,n3,code);
        String phone = sc.next();
        String code1 = sc.next();
        boolean flag = t.grabOrder(phone,code1);
        System.out.println(flag);
        t.printInfo();
        sc.close();
    }
}