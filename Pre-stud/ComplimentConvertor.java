import java.util.Scanner;

public class ComplimentConvertor 
{
    public static int choose()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Chooses What you want to know---");
        System.out.println("One Compliment Type 1");
        System.out.println("Two Compliment Type 2");
        System.out.println("Both Type 3");
        System.out.println("-----------------------------------");
        System.out.print("Type : ");
        int choose = sc.nextInt();
        sc.close();
        return choose;
    }

    public static char[] Onecompli(char Number[])
    {
        for (int i = 0;i < Number.length;i++)
            {
                if (Number[i] == '0')
                {
                    Number[i] = '1'; 
                }
                else
                {
                    Number[i] = '0';
                }
            }
        return Number;
    }
    
    public static char[] Twocompli(char Number[]) {
        boolean IsFoundOne = false;
        for (int i = Number.length - 1; i >= 0; i--) 
        {
            if (IsFoundOne == false && Number[i] == '1') 
            {
                IsFoundOne = true;
                continue;
            } else if (IsFoundOne == true) 
            {
                if (Number[i] == '0') {
                    Number[i] = '1';
                } else {
                    Number[i] = '0';
                }
            }
        }
        return Number;
    }

    public static void NumberTypePrint(char[] NumebrTy)
    {
        System.out.print("Your input = ");
        for (int i = 0;i < NumebrTy.length;i++)
        {
            System.out.print(NumebrTy[i]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Compliment convertor Program");
        System.out.print("Input Binary : ");
        String Number = sc.next();
        char Numbertype[] = Number.toCharArray();
        int WhatShouldIdo = choose();
        sc.close();

        if (WhatShouldIdo == 1)
        {
            NumberTypePrint(Numbertype);
            System.out.println(Onecompli(Numbertype));
        }
        else if (WhatShouldIdo == 2)
        {
            NumberTypePrint(Numbertype);
            System.out.println(Twocompli(Numbertype));
        }
        else if (WhatShouldIdo == 3)
        {
            char OGNumber[] = Numbertype.clone();
            NumberTypePrint(Numbertype);
            System.out.print("One Compliment = ");
            System.out.println(Onecompli(Numbertype));
            System.out.print("Two Compliment = ");
            System.out.println(Twocompli(OGNumber));
        }
    }    
}