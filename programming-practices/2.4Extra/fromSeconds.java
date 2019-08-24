import java.util.*;
public class fromSeconds {
    public static void main(String args[]) {
        int d1, hours, minutes, seconds;
        System.out.print("Type in a number of seconds:");
        Scanner scan = new Scanner(System.in);
        d1 = scan.nextInt();
        // if the amount of seconds is one hour or more
        if(d1 >= 3600)
        {
            hours = d1/3600;
            int remainderHr = d1 % 3600;
            // if there are extra minutes
            if(remainderHr != 0)
            {
                int remainderMin = remainderHr % 60;
                minutes = remainderHr / 60;
                if(hours == 1)
                {
                    // if there are extra seconds
                    if(remainderMin != 0)
                    {
                        if(remainderMin == 1)
                        {
                            if(minutes == 0)
                            {
                                System.out.println(hours + " hour " + remainderMin + " second");
                            }
                            else if(minutes == 1)
                            {
                                System.out.println(hours + " hour " + minutes + " minute " + remainderMin + " second");
                            }
                            else
                            {
                                System.out.println(hours + " hour " + minutes + " minutes " + remainderMin + " second");
                            } 
                        }
                        else
                        {
                            if(minutes == 0)
                            {
                                System.out.println(hours + " hour " + remainderMin + " seconds");
                            }
                            else if(minutes == 1)
                            {
                                System.out.println(hours + " hour " + minutes + " minute " + remainderMin + " seconds");
                            }
                            else
                            {
                                System.out.println(hours + " hour " + minutes + " minutes " + remainderMin + " seconds");
                            }
                        }
                    }
                    // if there are only extra minutes, no extra seconds
                    else
                    {
                        System.out.println(hours + " hour " + minutes + " minutes");
                    }
                }
                else
                {
                    // if there are extra seconds
                    if(remainderMin != 0)
                    {
                        if(remainderMin == 1)
                        {
                            if(minutes == 0)
                            {
                                System.out.println(hours + " hours " + remainderMin + " second");
                            }
                            else if(minutes == 1)
                            {
                                System.out.println(hours + " hours " + minutes + " minute " + remainderMin + " second");
                            }
                            else
                            {
                                System.out.println(hours + " hours " + minutes + " minutes " + remainderMin + " second");
                            } 
                        }
                        else
                        {
                            if(minutes == 0)
                            {
                                System.out.println(hours + " hours " + remainderMin + " seconds");
                            }
                            else if(minutes == 1)
                            {
                                System.out.println(hours + " hours " + minutes + " minute " + remainderMin + " seconds");
                            }
                            else
                            {
                                System.out.println(hours + " hours " + minutes + " minutes " + remainderMin + " seconds");
                            }
                        }
                    }
                    // if there are only extra minutes, no extra seconds
                    else
                    {
                        System.out.println(hours + " hours " + minutes + " minutes");
                    }
                }
            }
            // if the number is a straight hour, no extra minutes
            else
            {
                if(hours == 1)
                {
                    System.out.println(hours + " hour");
                }
                else
                {
                    System.out.println(hours + " hours");
                }
            }
        }
        // if the amount of seconds is one minute or more, but less than an hour
        else if(d1 >= 60 && d1 < 3600)
        {
            minutes = d1/60;
            int d1Mod = d1 % 60;
            // if there are extra seconds
            if(d1Mod != 0)
            {
                if(d1Mod == 1)
                {
                    if(minutes == 1)
                    {
                        System.out.println(minutes + " minute " + d1Mod + " second");
                    }
                    else
                    {
                        System.out.println(minutes + " minutes " + d1Mod + " second");
                    }
                }
                else
                {
                    if(minutes == 1)
                    {
                        System.out.println(minutes + " minute " + d1Mod + " seconds");
                    }
                    else
                    {
                        System.out.println(minutes + " minutes " + d1Mod + " seconds");
                    }
                }
            }
            // if there are not extra seconds
            else
            {
                if(minutes == 1)
                {
                    System.out.println(minutes + " minute");
                }
                else
                {
                    System.out.println(minutes + " minutes");
                }
            }
        }
        // if the amount of seconds is less than a minute
        else
        {
            if(d1 == 1)
            {
                System.out.println(d1 + " second");
            }
            else
            {
                System.out.println(d1 + " seconds");
            }
        }
    }
}
