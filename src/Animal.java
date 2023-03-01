public class Animal {
    // Class variables
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;
    private Diet diet;
    private AnimalType animalType;
    private double weight;
    private double height;
    private int lifespan;

    // Growth methods
    public double growHeight(double heightGrowthRate) {
        if (heightGrowthRate > 0) {
            this.height += heightGrowthRate;
            return this.height;
        }
        return 0;
    }
    public double growWeight(double weightGrowthRate) {
        if (weightGrowthRate > 0) {
            this.weight += weightGrowthRate;
            return this.weight;
        }
        return 0;
    }
    // Class constructors
    public Animal() {}
    public Animal(int numberOfLegs, int numberOfEyes,
                  String name, Diet diet, AnimalType animalType,
                  double height, double weight, int lifespan) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
        this.diet = diet;
        this.animalType = animalType;
        this.height = height;
        this.weight = weight;
        this.lifespan = lifespan;
    }
    // Getters and setters
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    public int getNumberOfEyes() {
        return numberOfEyes;
    }
    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Diet getDiet() {
        return diet;
    }
    public void setDiet(Diet diet) {
        this.diet = diet;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getLifespan() {
        return lifespan;
    }
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public AnimalType getAnimalType() {
        return animalType;
    }
    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
