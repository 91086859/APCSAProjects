public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, boolean owner, int age, double weight, String food)
    {
        super(name, owner, age, weight, food);
        this.breed = breed;
    }

    public String fetch()
    {
        if(Math.random() >= 0.5)
        {
            return "The little guy brought it back!";
        }
        else
        {
            return "No fetching here";
        }
    } // end method that exists in Dog but not Pet

    public String Speak()
    {
        if(this.age < 2)
        {
            return "Yap";
        }
        return "Woof";
    } // end method Speak which overrides abstract method in Pet

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }
        return dailyFeedings * 30;
    }

    public String toString()
    {
        return super.toString() + "\nbreed: " + breed;
    }
}
