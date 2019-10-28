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
    } // end main method
} // end class DogDriver
