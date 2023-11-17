import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   //Decare scan function
        String check;   //annouce string
        do{
            double score = scanner.nextDouble();    //Scan Double score and annouce score

            if (score > 100 || score < 0)
            {
                System.out.println("Error input Score");
            }
            else if (score >= 80)
            {
                System.out.println("A");
            }
            else if (score >= 70)
            {
                System.out.println("B");
            }
            else if (score >= 60)
            {
                System.out.println("C");
            }
            else if (score >= 50)
            {
                System.out.println("D");
            }
            else if (score < 40)
            {
                System.out.println("F");
            }
            check = scanner.next();     //scan check
        }while (check.equalsIgnoreCase("Yes")); //compare check is "Yes"
        scanner.close();    //close
    }

}