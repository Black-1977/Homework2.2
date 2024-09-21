public class Puffendue extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;


    public Puffendue(String name, int power, int transgression, int hardworking, int loyal, int honest) {
        super(name, power, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        this.faculty = "Puffendue";
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", faculty='" + faculty +
                "', power=" + power +
                ", transgression=" + transgression +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }

    @Override
    public int summarySpecialAbilities() {
        return hardworking + loyal + honest;
    }
}
