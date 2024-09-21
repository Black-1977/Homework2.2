public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.faculty = "Slytherin";

    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", faculty='" + faculty +
                "', power=" + power +
                ", transgression=" + transgression +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }

    @Override
    public int summarySpecialAbilities() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
}
