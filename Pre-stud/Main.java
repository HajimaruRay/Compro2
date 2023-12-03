import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lengthofarr = sc.nextInt();
        boolean check = false;
        int[] arr = new int[lengthofarr];

        for (int i = 0;i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int findint = sc.nextInt();

        for (int i = 0;i < arr.length;i++)
        {
            if (findint == arr[i])
            {
                System.out.println("Yes");
                check = true;
                break;
            }
        }

        if (check == false)
        {
            System.out.println("No");;
        }

        sc.close();
    }
}