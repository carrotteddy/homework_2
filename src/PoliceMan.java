public class PoliceMan extends Person implements Printable{
    private String rank;

    public String getRank() {
        return rank;
    }

    public PoliceMan(String name, int age, String rank) {
        super(name, age);
        this.rank = rank;
    }


    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() +" " + getName() +"\n AGE: " + getAge()
                + "\n RANK: " + getRank() );
    }
}
