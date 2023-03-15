public class Shark extends Fish{
    //Class variables
    private String skeleton;

    //Constructors
    public Shark() {
    }
    public Shark(int numberOfLegs, int numberOfEyes, String name, Diet diet, AnimalType animalType,
                 double height, double weight, int lifespan, String scaleColor, String waterType,
                 String skeleton) {
        super(numberOfLegs, numberOfEyes, name, diet, animalType, height, weight, lifespan, scaleColor, waterType);
        this.skeleton = skeleton;
    }

    //Getters and Setters
    public String getSkeleton() {
        return skeleton;
    }
    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    //Method
    public void sharkSkeleton() {
        System.out.println("This shark has a " + this.skeleton + " skeleton.");
    }
}
