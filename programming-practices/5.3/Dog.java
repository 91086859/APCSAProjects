public class Dog implements Comparable<Dog>
{
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount;

    public Dog()
    {

    } // end default Dog constructor

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    } // end Dog constructor

    public String getName()
    {
        return name;
    } // end getName()

    public int getAge()
    {
        return age;
    } // end getAge()

    public String getBreed()
    {
        return breed;
    } // end getBreed()

    public double getWeight()
    {
        return weight;
    } // end getWeight()

    public double getWeightInKilos()
    {
        return weight/2.205;
    } // end getWeightInKilos()

    public int getDogCount()
    {
        return dogCount;
    } // end getDogCount()

    public void setName(String name)
    {
        this.name = name;
    } // end setName()

    public void setAge(int age)
    {
        this.age = age;
    } // end setAge()

    // no setBreed because you can't change a dog's breed IRL

    public void setWeight(double weight)
    {
        this.weight = weight;
    } // end setWeight()

    public String toString()
    {
        return name + "'s Age: " + age + "\nBreed: " + breed + "\nWeight: " + weight;
    } // end toString()

    public int compareTo(Dog dog) 
    {
        if(age == dog.age)
        {
            return 0;
        } // end equal conditional
        else if(age > dog.age)
        {
            return 1;
        } // end greater than conditional
        else
        {
            return -1;
        } // end else conditional
    } // end compareTo()
} // end class Dog
