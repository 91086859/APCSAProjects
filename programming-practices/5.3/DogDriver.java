public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("Pog", 8, "New Guinea Singing Dog", 50);

        System.out.println(dog1.getName() + "'s Age: " + dog1.getAge());
        System.out.println(dog1.getName() + "'s Breed: " + dog1.getBreed());
        System.out.println();
        System.out.println(dog2.getName() + "'s Weight: " + dog2.getWeight());
        System.out.println();
        System.out.println(dog3);
        System.out.println();
        System.out.println(dog1.getDogCount() + " dogs");
        System.out.println();

        if(dog2.compareTo(dog1) == 0)
        {
            System.out.println(dog2.getName() + " is the same age as " + dog1.getName() + ".");
        }
        else if(dog2.compareTo(dog1) == 1)
        {
            System.out.println(dog2.getName() + " is older than " + dog1.getName() + ".");
        }
        else
        {
            System.out.println(dog2.getName() + " is younger than " + dog1.getName() + ".");
        }

        if(dog1.compareTo(dog3) == 0)
        {
            System.out.println(dog1.getName() + " is the same age as " + dog3.getName() + ".");
        }
        else if(dog1.compareTo(dog3) == 1)
        {
            System.out.println(dog1.getName() + " is older than " + dog3.getName() + ".");
        }
        else
        {
            System.out.println(dog1.getName() + " is younger than " + dog3.getName() + ".");
        }
    } // end main method
} // end class DogDriver
