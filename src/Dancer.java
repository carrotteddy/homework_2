public class Dancer extends Person implements Printable{
    private String danceStyle;

    public String getDanceStyle() {
        return danceStyle;
    }

    public Dancer(String name, int age, String danceStyle) {
        super(name, age);
        this.danceStyle = danceStyle;
    }
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " " +
                getName() + "\nAGE: " + getAge() + "\ndanceStyle: " + getDanceStyle() );
    }
}
