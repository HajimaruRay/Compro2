class Account 
{
    String name, code;
    double balance;
    boolean active;

    Account (String name, String code, double balance)
    {
        this.name = name;
        this.code = code;
        this.balance = balance;
        active = true;
        System.out.println("Open account");
    }

    void printInfo ()
    {
        if (active)
        {
            System.out.println(name + ", " + code + ", " + balance + ", active");
        }
        else
        {
            System.out.println(name + ", " + code + ", " + balance + ", inactive");
        }
    }

    void checkBalance ()
    {
        System.out.println(balance);
    }

    void closeAccount ()
    {
        active = false;
        printInfo();
    }

    void deposit (double money)
    {
        balance += money;
    }

    void withdrawn (double money)
    {
        balance -= money;
    }

}