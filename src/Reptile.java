public class Reptile extends Animal {
    // Class attributes
    private String skinColor;
    private String locomotion;

    // Constructors
    public Reptile () {
    }
    public Reptile (int numberOfLegs, int numberOfEyes,
                    String name, Diet diet, AnimalType animalType,
                    double height, double weight, int lifespan,
                    String skinColor, String locomotion) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan);
        this.skinColor = skinColor;
        this.locomotion = locomotion;
    }

    // Getters and Setters
    public String getSkinColor() {
        return skinColor;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    public String getLocomotion() {
        return locomotion;
    }
    public void setLocomotion(String locomotion) {
        this.locomotion = locomotion;
    }

    // Methods
    public void moves() {
        System.out.println("Reptile: " + super.getName() + " " + this.locomotion + "'s to move.");
    }
}
