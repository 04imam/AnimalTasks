

public class Main {
    public static void main() {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Human", 5, "Carnivora");
        animal[1] = new Dog("Koko", 5, 18,"Carnivora","German shepherd");
        animal[2] = new Bird("Soar", 2, 1, "White");
        animal[3] = new Pegion("Tinker", 2, 1, "black", "homing pigeon" );
        animal[4] = new Fish("Dory", 1, 3, "Mixed");
        animal[5] = new Blowfish("Bob", 2, 1);

        for (Animal a : animal) {
            System.out.println(a.toString());
            AnimalName.name(a.getName());
            System.out.println("Voice: " + a.getVoice());
            a.eat();
            a.move();
            System.out.println();
        }

        AnimalBehavior[] animalBehavior = new AnimalBehavior[]{
                new Dog("Ash", 3, 15, "Carnivora", "Labra"),
                new Pegion("Fly", 1, 0, "Grey", "Homing Pigeon"),
                new Blowfish("Swim", 1, 1, "Yellow", 3)
        };

        for (int i = 0; i < animalBehavior.length; i++) {
            System.out.print("Behaviour index " + i + ": ");
            animalBehavior[i].sleep();
        }
    }
}