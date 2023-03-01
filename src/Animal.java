public class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String color;
    private String name;
    private boolean laysEggs;
    private Diet diet;
    private AnimalType animalType;
    private double weight;
    private double height;
    public Animal() {}
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
    public Animal(int numberOfLegs, int numberOfEyes, String color,
                  String name, boolean laysEggs, Diet diet,
                  AnimalType animalType, double height, double weight) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.color = color;
        this.name = name;
        this.laysEggs = laysEggs;
        this.diet = diet;
        this.animalType = animalType;
        this.height = height;
        this.weight = weight;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public AnimalType getAnimalType() {
        return animalType;
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
}
