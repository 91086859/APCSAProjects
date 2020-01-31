import java.text.DecimalFormat;

public abstract class Pet
{
    private String name;
    public int age;
    private double weight; // in kg
    public boolean hasOwner;
    DecimalFormat fmt = new DecimalFormat();
    public String food;

    public Pet(String name, boolean hasOwner, int age, double weight, String food)
    {
        this.name = name;
        this.hasOwner = hasOwner;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }

    public double AmericanFreedomUnits()
    {
        return weight * 2.205;
    }

    public int getAge()
    {
        return age;
    }

    public abstract String Speak();
    abstract public int monthlyFeeding();

    public String toString()
    {
        return "name: " + name + "\nage: " + age + "\nweight: " + weight + " kg" + " (" + fmt.format(AmericanFreedomUnits()) + " in pounds)" + "\nFood: " + food;
    }
}
