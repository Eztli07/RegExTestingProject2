public class Snakes
{
    String breed;
    double length; //in ft
    boolean venomous;

    public Snakes(String breed, double length, boolean venomous)
    {
        this.breed = breed;
        this.length = length;
        this.venomous = venomous;
    }

    public String getBreed()
    {
        return breed;
    }

    public double getLength()
    {
        return length;
    }

    public boolean isVenomous()
    {
        return venomous;
    }
}
