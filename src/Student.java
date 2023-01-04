public class Student extends Person {
    private int studentCardNumber;

    public Student(String firstName, String lastName, int studentCardNumber) {
        super(firstName, lastName);
        this.studentCardNumber = studentCardNumber;
    }

    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(int studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }
    @Override
    public String toString() {
        return super.toString()+"studentCardNumber=" + studentCardNumber;
    }
}
