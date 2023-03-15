public class Hospital {
    public static void main(String[] args) {
        //New Animal-Mammal-Dog named Aloy
        Dog Aloy = new Dog(4,2, "Aloy", Diet.OMNIVORE, AnimalType.MAMMAL, 2, 30, 14,
                "Orange", false, "Bark", "Corgi");
        Aloy.species();
        Aloy.communicationMethod();

        //New Animal-Mammal-Cat named Puss
        Cat Puss = new Cat(4, 2, "Puss", Diet.OMNIVORE, AnimalType.MAMMAL, 1, 12, 18,
                "Orange/White", false, "Meow", "Cat");
        Puss.communicationMethod();
        Puss.purrs();

        //New Animal-Reptile-Snake named Kaa
        Reptile Kaa = new Snake(0, 2, "Kaa", Diet.CARNIVORE, AnimalType.REPTILE, 20, 110,
                12, "Black/Brown", "slither", "Rock Python", true);
        Kaa.moves();
        ((Snake) Kaa).swims();

        //New Animal-Fish-Shark named Bruce
        Shark Bruce = new Shark(0, 2, "Bruce", Diet.CARNIVORE, AnimalType.FISH, 15, 2000,
                70, "Grey/White", "Salt", "Cartilage");
        Bruce.moves();
        Bruce.sharkSkeleton();
    }
}
