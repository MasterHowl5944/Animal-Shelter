public class Mammal extends Animal {
    // Class attributes
    private String furColor;
    private boolean laysEggs;
    private String communication;

    // Constructors
    public Mammal(int numberOfLegs, int numberOfEyes,
                  String name, Diet diet, AnimalType animalType,
                  double height, double weight, int lifespan,
                  String furColor, boolean laysEggs, String communication) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan);
        this.furColor = furColor;
        this.laysEggs = laysEggs;
        this.communication = communication;
    }
    public Mammal () {
    }

    // Getters and Setters
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    public boolean doesItLayEggs() {
        return laysEggs;
    }
    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
    public String getCommunication() {
        return communication;
    }
    public void setCommunication(String communication) {
        this.communication = communication;
    }

    // Methods
    public void communicationMethod() {
        System.out.println("Mammal: " + super.getName() + " communicates with " + this.communication);
    }
}
