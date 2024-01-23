import java.util.Scanner;

class LectRoom102
{
    int classCode, capacity, currentSeats, classcheck;
    String name;

    LectRoom102 (int classCode, String name, int capacity)
    {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int currentSeats)
    {
        if (currentSeats > capacity)
        {
            return false;
        }
        else
        {
            capacity -= currentSeats;
            return true;
        }
    }
}

public class LactureRoom4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LectRoom102 LR[] = new LectRoom102[k];
        for (int i = 0;i < k;i++)
        {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            LR[i] = new LectRoom102(classCode, name, capacity);
        }
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            boolean Ismatch = false;
            int classcheck = sc.nextInt();
            int currentSeats = sc.nextInt();
            for (int j = 0;j < k;j++)
            {
                if (classcheck == LR[j].classCode && LR[j].reserveSeats(currentSeats))
                {
                    System.out.println(LR[j].name);
                    Ismatch = true;
                    break;
                }
            }
            if (!Ismatch)
            {
                System.out.println("sorry");
            }
        }
        sc.close();
    }
}