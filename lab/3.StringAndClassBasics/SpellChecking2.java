import java.util.Scanner;

public class SpellChecking2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int directoryNo = sc.nextInt();
        String directory[] = new String[directoryNo];
        
        for (int i = 0;i < directory.length;i++)
        {
            directory[i] = sc.next();
        }
        int TextCheckLength = sc.nextInt();
        String TextCheck[] = new String[TextCheckLength];
        int result[] = new int[TextCheckLength];
        for (int i = 0;i < TextCheckLength;i++)
        {
            TextCheck[i] = sc.next();
        }

        //HELL LOOP
        for (int i = 0; i < TextCheck.length; i++) 
        {
            int IscorrectlastMost = 0;
            for (int j = 0; j < directory.length; j++) 
            {
                char TextCheckSplit[] = TextCheck[i].toCharArray();
                char directorySplit[] = directory[j].toCharArray();
                int Iscorrect = 0;
                for (int a = 0;a < TextCheckSplit.length;a++)
                {
                    for (int b = 0;b < directorySplit.length;b++)
                    {
                        if (TextCheckSplit[a] == directorySplit[b])
                        {
                            Iscorrect++;
                        }
                        if (Iscorrect == directorySplit.length)
                        {
                            result[i] = j;
                            break;
                        }
                    }
                    if (IscorrectlastMost < Iscorrect)
                    {
                        IscorrectlastMost = Iscorrect;
                        //System.out.println("Iscorrect = " + Iscorrect + " Iscorrectlast = " + IscorrectlastMost);
                        //result[i] = j;
                    }
                }
                System.out.println(TextCheck[i] + " " + directory[j] + " " + IscorrectlastMost);
                //System.out.println("The most = " + directory[result[i]]);
            }
            System.out.println(directory[result[i]]);
        }
        sc.close();
    }   
}