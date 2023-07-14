public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("Dancer", "John", 25, "Contemporary");
        objects[1] = createObject("Lawyer", "Sarah", 35, "Corporate Law");
        objects[2] = createObject("PoliceMan", "Mike", 30, "Sergeant");

        for (Printable obj : objects) {
            obj.print();
        }
    }
    public static Printable createObject(String className, String name, int age, String additionalInfo) {
        switch (className) {
            case "Dancer":
                return new Dancer(name, age, additionalInfo);
            case "Lawyer":
                return new Lawyer(name, age, additionalInfo);
            case "PoliceMan":
                return new PoliceMan(name, age, additionalInfo);
            default:
                throw new IllegalArgumentException("Ошибка" + className);
        }
    }
}
