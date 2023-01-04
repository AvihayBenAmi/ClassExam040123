import java.util.Arrays;

public class Course {
    private String name;
    private Lecturer lecturer;
    private Student[] students;

    public Course(String name, Lecturer lecturer, Student[] students) {
        this.name = name;
        this.lecturer = lecturer;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", lecturer=" + lecturer +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public void addStudent(Student student) {
        if (this.students == null) {
            this.students = new Student[1];
            this.students[1] = student;
        } else {
            Student[] newStudents = new Student[this.students.length + 1];
            for (int i = 0; i < this.students.length; i++) {
                newStudents[i] = this.students[i];
            }
            newStudents[newStudents.length - 1] = student;
            this.students = newStudents;
        }
    }
}
