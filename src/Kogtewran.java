public class Kogtewran extends Hogwarts {
    private final int wise;
    private final int witty;
    private final int creativity;

    public Kogtewran(String name, int power, int transgression, int wise, int witty, int creativity) {
        super(name, power, transgression);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
        this.faculty = "Kogtewran";

    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", faculty='" + faculty +
                "', power=" + power +
                ", transgression=" + transgression +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity;
    }

    @Override
    public int summarySpecialAbilities() {
        return wise + witty + creativity;
    }
}
