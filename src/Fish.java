public class Fish extends Animal {
    // Class attributes
    private String scaleColor;
    private String waterType;

    // Constructors
    public Fish(int numberOfLegs, int numberOfEyes,
                String name, Diet diet, AnimalType animalType,
                double height, double weight, int lifespan,
                String scaleColor, String waterType) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan);
        this.scaleColor = scaleColor;
        this.waterType = waterType;
    }

    // Getters and Setters
    public String getScaleColor() {
        return scaleColor;
    }
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    public String getWaterType() {
        return waterType;
    }
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    // Methods
    public void moves() {
        System.out.println("Fish: " + super.getName() + " lives in " + getWaterType() + " water.");
    }
}
