import java.util.Arrays;
import java.util.Scanner;

public class Circle {
    private int idCourse;
    private String name;
    private Course[] courses;
    private Lecturer[] lecturers;

    public Circle(int idCourse, String name, Course[] courses, Lecturer[] lecturers) {
        this.idCourse = idCourse;
        this.name = name;
        this.courses = courses;
        this.lecturers = lecturers;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Lecturer[] getLecturers() {
        return lecturers;
    }

    public void setLecturers(Lecturer[] lecturers) {
        this.lecturers = lecturers;
    }

    @Override
    public String toString() {
        return "idCourse " + idCourse + " name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", lecturers=" + Arrays.toString(lecturers);
    }
    public void printBasicData(){
        System.out.println(idCourse + " " + name);
    }

    public void addCourse() {
        Scanner scanner = new Scanner(System.in);
        String nameCourse;
        System.out.println("Enter The Name of Curse");
        nameCourse = scanner.nextLine();
        Course course = new Course(nameCourse, null, null);
        if (this.courses == null) {
            this.courses = new Course[1];
            this.courses[1] = course;
        } else {
            Course[] newCourses = new Course[this.courses.length + 1];
            for (int i = 0; i < this.courses.length; i++) {
                newCourses[i] = this.courses[i];
            }
            newCourses[newCourses.length - 1] = course;
            this.courses = newCourses;
        }
    }

    public void addLecturer() {
        Scanner scanner = new Scanner(System.in);
        Lecturer lecturer = null;
        System.out.println("Enter The First name of Lecturer");
        lecturer.setFirstName(scanner.nextLine());
        System.out.println("Enter The last name of Lecturer");
        lecturer.setLastName(scanner.nextLine());
        System.out.println("Enter The senurity of Lecturer");
        lecturer.setSenuirity(scanner.nextInt());
        if (this.lecturers == null) {
            this.lecturers = new Lecturer[1];
            this.lecturers[1] = lecturer;
        } else {
            Lecturer[] newLectureres = new Lecturer[this.lecturers.length + 1];
            for (int i = 0; i < this.lecturers.length; i++) {
                newLectureres[i] = this.lecturers[i];
            }
            newLectureres[newLectureres.length - 1] = lecturer;
            this.lecturers = newLectureres;
        }

    }
}
