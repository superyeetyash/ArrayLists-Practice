package SchoolAssignments;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal animal1 = new Animal();
        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow
        animal1.makeSound(); // Outputs: Some generic animal sound
    }
}
