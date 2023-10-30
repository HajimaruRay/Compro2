import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String check;
        do{
            double score = scanner.nextDouble();

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
            check = scanner.next();
        }while (check.equalsIgnoreCase("Yes"));
        scanner.close();
    }

}