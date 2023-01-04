public class Lecturer extends Person {
    private int senuirity;

    public Lecturer(String firstName, String lastName, int senuirity) {
        super(firstName, lastName);
        this.senuirity = senuirity;
    }

    public int getSenuirity() {
        return senuirity;
    }

    public void setSenuirity(int senuirity) {
        this.senuirity = senuirity;
    }

    @Override
    public String toString() {
        return super.toString() + "senuirity=" + senuirity;
    }
}
