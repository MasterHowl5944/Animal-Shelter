public class Snake extends Reptile {
    private String species;
    private boolean canSwim;

    // Constructors
    public Snake(int numberOfLegs, int numberOfEyes, String name, Diet diet, AnimalType animalType,
                 double height, double weight, int lifespan, String skinColor, String locomotion,
                 String species, boolean canSwim) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan, skinColor, locomotion);
        this.species = species;
        this.canSwim = canSwim;
    }

    //Getters and Setters
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public boolean isCanSwim() {
        return canSwim;
    }
    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    //Method
    public void swims() {
        if (canSwim = true) {
            System.out.println("This " + getSpecies() + " can swim!");
        }
        else {
            System.out.println("This " + getSpecies() + " cannot swim.");
        }
    }
}
