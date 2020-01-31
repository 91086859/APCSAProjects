public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, boolean owner, int age, double weight, String food)
    {
        super(name, owner, age, weight, food);
        this.species = species;
    }

    public String Speak()
    {
        return "Hissssss";
    }

    public int monthlyFeeding()
    {
        return 8;
    }

    public String toString()
    {
        return super.toString() + "\nspecies: " + species;
    }
}
