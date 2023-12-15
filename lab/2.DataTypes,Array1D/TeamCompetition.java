import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MatchCount = sc.nextInt();
        int team1[] = new int[MatchCount], team2[] = new int[MatchCount];
        int score1 = 0,score2 = 0;

        for (int i = 0;i < team1.length;i++)
        {
            team1[i] = sc.nextInt();
        }
        for (int i = 0;i < team2.length;i++)
        {
            team2[i] = sc.nextInt();
        }

        for (int i = 0;i < MatchCount;i++)
        {
            
            if (team1[i] > team2[i])
            {
                score1+=2;
            }
            else if (team1[i] < team2[i])
            {
                score2+=2;
            }
            else
            {
                score1++;
                score2++;
            }
        }

        if (score1 > score2)
        {
            System.out.println("Team 1 wins");
            System.out.println("Score " + score1 + " to " + score2);
        }
        else if (score1 < score2)
        {
            System.out.println("Team 2 wins");
            System.out.println("Score " + score2 + " to " + score1);
        }
        else
        {
            System.out.println("Draw game");
            System.out.println("Score " + score1 + " to " + score2);
        }
        sc.close();
    }
}
