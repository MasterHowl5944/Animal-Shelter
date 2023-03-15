public class Cat extends Mammal{
    private String breed;

    // Constructors
    public Cat(int numberOfLegs, int numberOfEyes, String name, Diet diet, AnimalType animalType,
               double height, double weight, int lifespan, String furColor, boolean laysEggs, String communication,
               String breed) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan, furColor, laysEggs, communication);
        this.breed = breed;

    }
    public Cat() {};

    //Method
    public void purrs() {
        System.out.println("The " + this.breed + " purrs.");
    }
}
