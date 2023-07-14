public class Lawyer extends Person implements Printable{
    private String lawField;

    public String getLawField() {
        return lawField;
    }

    public Lawyer(String name, int age, String lawField) {
        super(name, age);
        this.lawField = lawField;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() +" " +  getName() +"\n AGE: "
                + getAge() +"\n LAW FIELD: " + getLawField());
    }
}
