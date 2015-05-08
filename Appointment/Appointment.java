/**
 * @author Tony Hendrick
 * @version 4/23/15
 */
public class Appointment
{
    //Need to add String appointment
    DayOfWeek day;
    String time;
    String appointment;

    public Appointment(DayOfWeek d, String t, String a) /*throws Exception*/
    {
        day = d;
        time = "1200a";
        appointment = a;

        String numInTime = t.substring(0, t.length() - 1);
        String letterInTime = t.substring(t.length() - 1);
        int intInTime = 0;

        try
        {
            intInTime = Integer.parseInt(numInTime);

            if ( (letterInTime.equals("a") || letterInTime.equals("p")) && numInTime.length() >= 3 && numInTime.length() <= 4 && intInTime >= 0 && intInTime <= 2400 )
            {
                System.out.println(intInTime);
                time = t;
            }
            else
            {
                throw new IllegalArgumentException(("Time format must be 3-4 digits followed by letter a or p (Ex: 1230a)"));
            }
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Time format must include only digits...");
        }
        catch(IndexOutOfBoundsException ioob)
        {
            System.out.println("Unable to get substring of t in Appointment class...");
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }

    }
}
