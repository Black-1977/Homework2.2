public abstract class Hogwarts {
    protected final String name;
    protected final int power;
    protected final int transgression;
    protected String faculty = "None";

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", faculty='" + faculty +
                ", power=" + power +
                ", transgression=" + transgression;
    }

    public String getName() {
        return name;
    }

    private int summaryBasicAbilities() {
        return power + transgression;
    }

    protected abstract int summarySpecialAbilities();

    public void compareBasicAbilities(Hogwarts student) {
        int sum1 = summaryBasicAbilities();
        int sum2 = student.summaryBasicAbilities();
        if (sum1 == sum2) {
            System.out.println(name + " и " + student.getName() + " одинаковы по базовым навыкам");
        } else if (sum1 > sum2) {
            System.out.println(name + " лучше, чем " + student.getName() + " по базовым навыкам");
        } else {
            System.out.println(student.getName() + " лучше, чем " + name + " по базовым навыкам");
        }
    }

    public void compareSpecialAbilities(Hogwarts student) {
        if (!faculty.equals(student.faculty)) {
            System.out.println(name + " и " + student.getName() + " с разных факультетов");
            return;
        }
        int sum1 = summarySpecialAbilities();
        int sum2 = student.summarySpecialAbilities();
        if (sum1 == sum2) {
            System.out.println(name + " и " + student.getName() + " одинаковы по специальным навыкам");
        } else if (sum1 > sum2) {
            System.out.println(name + " лучше, чем " + student.getName() + " по специальным навыкам");
        } else {
            System.out.println(student.getName() + " лучше, чем " + name + " по специальным навыкам");
        }
    }
}
