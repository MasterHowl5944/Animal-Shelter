public class Dog extends Mammal {
    private String breed;

    // Constructors
    public Dog(int numberOfLegs, int numberOfEyes, String name, Diet diet, AnimalType animalType,
               double height, double weight, int lifespan, String furColor, boolean laysEggs, String communication,
               String breed) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan, furColor, laysEggs, communication);
        this.breed = breed;
    }
    public Dog() {
    }

    //Getters and Setters
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Methods
    public void species() {
        System.out.println("This " + super.getName() + " is a " + this.breed);
    }
}