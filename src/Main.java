public class Main {
    public static void main(String[] args) {
        Hogwarts harry = new Gryffindor("Гарри Поттер", 100, 80, 100, 100, 100);
        Hogwarts hermione = new Gryffindor("Гермиона Грейнджер", 90, 80, 90, 100, 100);
        Hogwarts ron = new Gryffindor("Рон Уизли", 90, 80, 90, 100, 100);
        Hogwarts draco = new Slytherin("Драко Малфой", 90, 70, 90, 100, 100, 80, 70);
        System.out.println(harry);
        System.out.println(draco);
        harry.compareSpecialAbilities(hermione);
        hermione.compareSpecialAbilities(ron);
        harry.compareBasicAbilities(draco);
        harry.compareSpecialAbilities(draco);
    }
}
