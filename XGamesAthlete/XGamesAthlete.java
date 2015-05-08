/**
 * This is an implementation of a basic X Games Athlete that extends the Person class by adding in a sport,
 * country, years attended the games, gold medal, silver medal, and bronze medal count, the athlete's
 * height in inches, and the athletes weight in pounds.
 *
 * @author Tony Hendrick
 * @version 1.0
 */
public class XGamesAthlete extends Person
{
    private String sport;
    private String country;
    private int yearsAttended;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;
    private double heightInches;
    private double weightPounds;

    /**
     * This generic instructor sets the sport to "Undefined", the country to "Undefined", and the years attended, gold
     * medals, silver medals, bronze medals, height in inches, and weight in inches to 0
     */
    public XGamesAthlete()
    {
        super();

        sport = "Undefined";
        country = "Undefined";
        yearsAttended = 0;
        goldMedals = 0;
        silverMedals = 0;
        bronzeMedals = 0;
        heightInches = 0;
        weightPounds = 0;
    }

    /**
     * This constructor sets all of the properties of the X Games Athlete class along with the most commonly used
     * properties of the Person class to those defined by the user.
     * @param fn The first name of the new X Games Athlete object
     * @param ln The last name of the new X Games Athlete object
     * @param a The age of the new X Games Athlete object as an integer between 0 and 150
     * @param g The gender of the new X Games Athlete object as either "male" or "female"
     * @param s The sport of the new X Games Athlete object - valid values are "Skateboarding", "Snowboarding", "Surfing", "Skiing", "BMX", "MotoX", or "Rally"
     * @param c The country of the new X Games Athlete Object
     * @param y The previous years attended of the new X Games Athlete object as an integer greater than 0
     * @exception IllegalArgumentException This is thrown when the sport does not equal one of the ones defined in the s param, or if the years previously attended is less than 0
     */
    public XGamesAthlete(String fn, String ln, int a, String g, String s, String c, int y)
    {
        super(fn, ln, a, g);

        if( s.equals("Skateboarding") || s.equals("Snowboarding") || s.equals("Surfing") || s.equals("Skiing") || s.equals("BMX") || s.equals("MotoX") || s.equals("Rally") )
        {
            sport = s;
        }
        else
        {
            throw new IllegalArgumentException("All athletes must participate in either Skateboarding, Snowboarding, Surfing, Skiing, BMX, MotoX, or Rally");
        }

        country = c;

        if( y >= 0 )
        {
            yearsAttended = y;
        }
        else
        {
            throw new IllegalArgumentException("An athletes years attended must be at least 0");
        }
    }

    /**
     * This method sets the value of the sport for this X Games Athlete object
     * @param s The sport of the new X Games Athlete object - valid values are "Skateboarding", "Snowboarding", "Surfing", "Skiing", "BMX", "MotoX", or "Rally"
     * @exception IllegalArgumentException This is thrown if the sport is not one of the previously stated values in the s parameter
     */
    public void setSport(String s)
    {
        if( s.equals("Skateboarding") || s.equals("Snowboarding") || s.equals("Surfing") || s.equals("Skiing") || s.equals("BMX") || s.equals("MotoX") || s.equals("Rally") )
        {
            sport = s;
        }
        else
        {
            throw new IllegalArgumentException("All athletes must participate in either Skateboarding, Snowboarding, Surfing, Skiing, BMX, MotoX, or Rally");
        }
    }

    /**
     * This method sets the value of the country for this X Games Athlete object
     * @param c The country of the new X Games Athlete Object
     */
    public void setCountry(String c)
    {
        country = c;
    }

    /**
     * This method sets the value of the previous years attended for this X Games Athlete object
     * @param y The previous years attended of the new X Games Athlete object as an integer greater than 0
     * @exception IllegalArgumentException This is thrown if the years attended is less than zero
     */
    public void setYearsAttended(int y)
    {
        if( y >= 0 )
        {
            yearsAttended = y;
        }
        else
        {
            throw new IllegalArgumentException("An athletes years attended must be at least 0");
        }
    }

    /**
     * This method sets the value of the gold medals obtained for this X Games Athlete object
     * @param g The gold medals obtained of the new X Games Athlete object as an integer greater than zero
     * @exception IllegalArgumentException This is thrown if the gold medals obtained is less than zero
     */
    public void setGoldMedals(int g)
    {
        if( g >= 0 )
        {
            goldMedals = g;
        }
        else
        {
            throw new IllegalArgumentException("An athlete must have at least 0 gold medals");
        }
    }

    /**
     * This method sets the value of the silver medals obtained for this X Games Athlete object
     * @param sm The silver medals obtained of the new X Games Athlete object as an integer greater than zero
     * @exception IllegalArgumentException This is thrown if the silver medals obtained is less than zero
     */
    public void setSilverMedals(int sm)
    {
        if( sm >= 0 )
        {
            silverMedals = sm;
        }
        else
        {
            throw new IllegalArgumentException("An athlete must have at least 0 silver medals");
        }
    }

    /**
     * This method sets the value of the bronze medals obtained for this X Games Athlete object
     * @param b The bronze medals obtained of the new X Games Athlete object as an integer greater than zero
     * @exception IllegalArgumentException This is thrown if the bronze medals obtained is less than zero
     */
    public void setBronzeMedals(int b)
    {
        if( b >= 0 )
        {
            bronzeMedals = b;
        }
        else
        {
            throw new IllegalArgumentException("An athlete must have at least 0 bronze medals");
        }
    }

    /**
     * This method sets the value of the height in inches for this X Games Athlete object
     * @param h The height in inches of the new X Games Athlete object as a double between 0 and 120
     * @exception IllegalArgumentException This is thrown if the height in inches is not between 0 and 120
     */
    public void setHeightInches(double h)
    {
        if( h >= 0 && h <= 120 )
        {
            heightInches = h;
        }
        else
        {
            throw new IllegalArgumentException("An athlete must be between 0 and 120 inches in height");
        }
    }

    /**
     * This method sets the value of the weight in pounds for this X Games Athlete object
     * @param w The weight in pounds of the new X Games Athlete object as a double between 0 and 800
     * @exception IllegalArgumentException This is thrown if the weight in pounds is not between 0 and 800
     */
    public void setWeightPounds(double w)
    {
        if( w >= 0 && w <= 800 )
        {
            weightPounds = w;
        }
        else
        {
            throw new IllegalArgumentException("An athlete must weight between 0 and 800 pounds");
        }
    }

    /**
     * This method shows the value of the X Games Athlete object's sport
     * @return sport
     */
    public String getSport()
    {
        return sport;
    }

    /**
     * This method shows the value of the X Games Athlete object's country
     * @return country
     */
    public String getCountry()
    {
        return country;
    }

    /**
     * This method shows the value of the X Games Athlete object's previous years attended
     * @return yearsAttended
     */
    public int getYearsAttended()
    {
        return yearsAttended;
    }

    /**
     * This method shows the value of the X Games Athlete object's gold medals
     * @return goldMedals
     */
    public int getGoldMedals()
    {
        return goldMedals;
    }

    /**
     * This method shows the value of the X Games Athlete object's silver medals
     * @return silverMedals
     */
    public int getSilverMedals()
    {
        return silverMedals;
    }

    /**
     * This method shows the value of the X Games Athlete object's bronze medals
     * @return bronzeMedals
     */
    public int getBronzeMedals()
    {
        return bronzeMedals;
    }

    /**
     * This method shows the value of the X Games Athlete object's height in inches
     * @return heightInches
     */
    public double getHeightInches()
    {
        return heightInches;
    }

    /**
     * This method shows the value of the X Games Athlete object's weight in pounds
     * @return weightPounds
     */
    public double getWeightPounds()
    {
        return weightPounds;
    }

}
