import java.util.Scanner;

class Television
{
    public int Channel;
    public int Volume;
    public boolean IsTVTurnOn;

    Television (int Channel, int Volume)
    {
        this.Channel = Channel;
        this.Volume = Volume;
        IsTVTurnOn = false;
    }

    boolean turnOn()
    {
        if (!IsTVTurnOn)
        {
            IsTVTurnOn = true;
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean turnOff()
    {
        if (IsTVTurnOn)
        {
            IsTVTurnOn = false;
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean ChannelUp()
    {
        if (Channel+1 > 0 && Channel+1 <= 50 && IsTVTurnOn)
        {
            Channel++;
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean ChannelDown()
    {
        if (Channel-1 > 0 && Channel-1 <= 50 && IsTVTurnOn)
        {
            Channel--;
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean VolumeUp()
    {
        if (Volume+1 > 0 && Volume+1 <= 99 && IsTVTurnOn)
        {
            Volume++;
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean VolumeDown()
    {
        if (Volume-1 > -1 && Volume-1 <= 99 && IsTVTurnOn)
        {
            Volume--;
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class OneMote
{
    public Television Te[] = new Television[1000000];
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int target = 0;
        int N = sc.nextInt();
        Television Te[] = new Television[N];
        for (int i = 0;i < N;i++)
        {
            Te[i] = new Television(1, 0);
        }

        while(true)
        {
            String Command = sc.next();
            if (Command.equals("change_target"))
            {
                int z = sc.nextInt();
                if (z > 0 && z <= N)
                {
                    target = z-1;
                    System.out.println("target tv is " + (target+1));
                }
                else
                {
                    System.out.println("invalid position");
                }
            }
            if (Command.equals("turn_on"))
            {
                if (Te[target].turnOn())
                {
                    System.out.println((target+1) + " tv has been turned on");
                }
            }
            if (Command.equals("turn_off"))
            {
                if (Te[target].turnOff())
                {
                    System.out.println((target+1) + " tv has been turned off ");
                }
            }
            if (Command.equals("channel_up"))
            {
                if (Te[target].ChannelUp())
                {
                    System.out.println("the " + (target+1) + " tv channel is " + Te[target].Channel);
                }
                else if (!Te[target].ChannelUp() && Te[target].IsTVTurnOn)
                {
                    System.out.println("cannot change " + (target+1) + " tv channel");
                }
            }
            if (Command.equals("channel_down"))
            {
                if (Te[target].ChannelDown())
                {
                    System.out.println("the " + (target+1) + " tv channel is " + Te[target].Channel);
                }
                else if (!Te[target].ChannelDown() && Te[target].IsTVTurnOn)
                {
                    System.out.println("cannot change " + (target+1) + " tv channel");
                }
            }
            if (Command.equals("volume_up"))
            {
                if (Te[target].VolumeUp())
                {
                    System.out.println("the " + (target+1) + " tv volume level is " + Te[target].Volume);
                }
                else if (!Te[target].VolumeUp() && Te[target].IsTVTurnOn)
                {
                    System.out.println("cannot change "+ (target+1) + " tv volume");
                }
            }
            if (Command.equals("volume_down"))
            {
                if (Te[target].VolumeDown())
                {
                    System.out.println("the " + (target+1) + " tv volume level is " + Te[target].Volume);
                }
                else if (!Te[target].VolumeDown() && Te[target].IsTVTurnOn)
                {
                    System.out.println("cannot change "+ (target+1) + " tv volume");
                }
            }
            if (Command.equals("all_turn_on"))
            {
                for (int i = 0;i < N;i++)
                {
                    if (Te[i].turnOn())
                    {
                        System.out.println((i+1) + " tv has been turned on");
                    }
                }
            }
            if (Command.equals("all_turn_off"))
            {
                for (int i = 0;i < N;i++)
                {
                    if (Te[i].turnOff())
                    {
                        System.out.println((i+1) + " tv has been turned off");
                    }
                }
            }
            if (Command.equals("stop"))
            {
                break;
            }
        }
        sc.close();
    }
}