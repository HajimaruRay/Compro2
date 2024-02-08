package Remote;
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

public class Remote 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int CH = sc.nextInt();
        int VOL = sc.nextInt();
        Television Te = new Television(CH, VOL);
        while(true)
        {
            String Command = sc.next();

            if (Command.equals("turn_on"))
            {
                if (Te.turnOn())
                {
                    System.out.println("tv has been turned on");
                }
            }
            if (Command.equals("turn_off"))
            {
                if (Te.turnOff())
                {
                    System.out.println("tv has been turned off ");
                }
            }
            if (Command.equals("channel_up"))
            {
                if (Te.ChannelUp())
                {
                    System.out.println("the channel is " + Te.Channel);
                }
                else if (!Te.ChannelUp() && Te.IsTVTurnOn)
                {
                    System.out.println("cannot change channel");
                }
            }
            if (Command.equals("channel_down"))
            {
                if (Te.ChannelDown())
                {
                    System.out.println("the channel is " + Te.Channel);
                }
                else if (!Te.ChannelDown() && Te.IsTVTurnOn)
                {
                    System.out.println("cannot change channel");
                }
            }
            if (Command.equals("volume_up"))
            {
                if (Te.VolumeUp())
                {
                    System.out.println("the volume level is " + Te.Volume);
                }
                else if (!Te.VolumeUp() && Te.IsTVTurnOn)
                {
                    System.out.println("cannot change volume");
                }
            }
            if (Command.equals("volume_down"))
            {
                if (Te.VolumeDown())
                {
                    System.out.println("the volume level is " + Te.Volume);
                }
                else if (!Te.VolumeDown() && Te.IsTVTurnOn)
                {
                    System.out.println("cannot change volume");
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
