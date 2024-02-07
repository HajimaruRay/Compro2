import java.util.Scanner;

class ContactBook
{
    String name[], tellNo[];
    ContactBook (String[] name, String[] tellNo)
    {
        this.name = name;
        this.tellNo = tellNo;
    }

    void getAllContact()
    {
        for (int i = 0;i < name.length;i++)
        {
            System.out.println(name[i] + " " + tellNo[i]);
        }
    }

    void getContact(String nameCheck)
    {
        boolean Isfound = false;
        for (int i = 0;i < name.length;i++)
        {
            //System.out.println(name[i] + " " + nameCheck + " " + name[i].equals(nameCheck));
            if (name[i].equalsIgnoreCase(nameCheck))
            {
                Isfound = true;
                System.out.println(tellNo[i]);
                break;
            }
        }
        if (!Isfound)
        {
            System.out.println("Invalid contact");
        }
    }

    void editNumber(String nameCheck, String newTellNo)
    {
        boolean Isfound = false;
        for (int i = 0;i < name.length;i++)
        {
            if (name[i].equals(nameCheck))
            {
                Isfound = true;
                if (onlyDigits(newTellNo))
                {
                    tellNo[i] = newTellNo;
                    System.out.println(name[i] + " new number is " + tellNo[i]);
                }
                else
                {
                    System.out.println("Invalid number");
                }
                break;
            }
        }
        if (!Isfound)
        {
            System.out.println("Invalid contact");
        }
    }

    static boolean onlyDigits(String newtellNo)
    {
        int count = 0;
        for (int i = 0;i < newtellNo.length();i++)
        {
            if (newtellNo.charAt(0) == '0' && newtellNo.charAt(i) >= '0' && newtellNo.charAt(i) <= '9' && (newtellNo.length() == 9 || newtellNo.length() == 10))
            {
                count++;
            }
        }
        if (count == newtellNo.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class ContactManager
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[] = new String[n];
        String tellNo[] = new String[n];

        for (int i = 0;i < n;i++)
        {
            name[i] = sc.next();
            tellNo[i] = sc.next();
        }
        ContactBook CB = new ContactBook(name, tellNo);

        int k = sc.nextInt();
        for (int i = 0;i < k;i++)
        {
            int check = sc.nextInt();

            if (check == 1)
            {
                String nameCheck = sc.next();
                CB.getContact(nameCheck);
            }
            else if (check == 2)
            {
                String nameCheck = sc.next();
                String newTellNo = sc.next();
                CB.editNumber(nameCheck, newTellNo);
            }
            else if (check == 3)
            {
                CB.getAllContact();
            }
            else
            {
                System.out.println("Invalid command");
            }
        }

        sc.close();
    }
}