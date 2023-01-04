public class HeadOfCourse extends Person {
    private int senuirity;
    private String specialty;
    private String degree;

    public HeadOfCourse(String firstName, String lastName, int senuirity, String specialty, String degree) {
        super(firstName, lastName);
        this.senuirity = senuirity;
        this.specialty = specialty;
        this.degree = degree;
    }

    public int getSenuirity() {
        return senuirity;
    }

    public void setSenuirity(int senuirity) {
        this.senuirity = senuirity;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() +
                "senuirity=" + senuirity +
                ", specialty='" + specialty + '\'' +
                ", degree='" + degree + '\'';
    }
}
