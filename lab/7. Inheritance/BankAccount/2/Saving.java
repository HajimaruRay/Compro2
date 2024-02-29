class Saving extends Account
{
    String id = null, tel = null;
    boolean prompPay;

    Saving (String name, String code, double balance)
    {
        super(name, code, balance);
        prompPay = false;
        System.out.println("Saving account");
    }

    void  openPromptPay(int Check, String data)
    {
        if (Check == 1)
        {
            if (data.length() == 13)
            {
                prompPay = true;
                id = data;
                System.out.println(prompPay);
            }
            else
            {
                System.out.println("false");
            }
        }
        else if (Check == 2)
        {
            if (data.length() == 10)
            {
                prompPay = true;
                tel = data;
                System.out.println(prompPay);
            }
            else
            {
                System.out.println("false");
            }
        }
    }

    @Override
    void printInfo ()
    {
        super.printInfo();
        if (prompPay)
        {
            System.out.print("PromptPay");
            if (id != null && tel != null)
            {
                System.out.println(", " + id + ", " + tel);
            }
            else if (id != null && tel == null)
            {
                System.out.println(", " + id);
            }
            else if (id == null && tel != null)
            {
                System.out.println(", " + tel);
            }
        }
        else
        {
            System.out.println("no PromptPay");
        }
    }
}