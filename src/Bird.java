public class Bird extends Animal{
    // Class attributes
    private String featherColors;
    private int numberOfEggs;

    // Constructor
    public Bird() {
    }
    public Bird(int numberOfLegs, int numberOfEyes,
                String name, Diet diet, AnimalType animalType,
                double height, double weight, int lifespan,
                String featherColors, int numberOfEggs) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan);
        this.featherColors = featherColors;
        this.numberOfEggs = numberOfEggs;
    }

    // Getters and Setters
    public String getFeatherColors() {
        return featherColors;
    }
    public void setFeatherColors(String featherColors) {
        this.featherColors = featherColors;
    }
    public int getNumberOfEggs() {
        return numberOfEggs;
    }
    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    // Methods
    public void moves () {
        System.out.println("Bird: " + super.getName() + " flies!");
    }
}
