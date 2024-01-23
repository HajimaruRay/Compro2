import java.util.Scanner;

class LectRoom101
{
    int classCode, capacity, currentSeats;
    String name;

    LectRoom101 (int classCode, String name, int capacity)
    {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }
}

public class LactureRoom3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LectRoom101 LR[] = new LectRoom101[k];
        for (int i = 0;i < k;i++)
        {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            LR[i] = new LectRoom101(classCode, name, capacity);
            
        }
        for (int i = 0;i < 3;i++)
        {
            int getter = sc.nextInt()-1;
            System.out.println(LR[getter].classCode + " " + LR[getter].name + " " + LR[getter].capacity);
        }
        sc.close();
    }
}
