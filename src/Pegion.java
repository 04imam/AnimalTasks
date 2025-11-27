

public class Pegion extends Bird implements AnimalBehavior{
    private String species;
    public Pegion() {
        super();
        this.species = "House sparrow";
    }

    public Pegion(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pegion(String name, int weight, String species) {
        super(name, weight, "brown");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds and grains.");
    }

    @Override
    public String getVoice() {
        return "Coo!";
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Pigeon) sleeps standing.");
    }

    @Override
    public void move() {
        System.out.println(getName() + ", the Pigeon flies.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return super.toString() + " | species: " + species;
    }
}