public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name, int power, int transgression, int nobility, int honor, int courage) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.faculty = "Gryffindor";
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", faculty='" + faculty +
                "', power=" + power +
                ", transgression=" + transgression +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }

    @Override
    public int summarySpecialAbilities() {
        return nobility + honor + courage;
    }
}
