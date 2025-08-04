package hafta2.student_information_system;

public class Course {

    private String name;

    private String code;

    private int hoursOfWeek;

    private Teacher teacher;

    private Integer note;

    public Course(String name, String code, int hoursOfWeek) {
        this.name = name;
        this.code = code;
        this.hoursOfWeek = hoursOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHoursOfWeek() {
        return hoursOfWeek;
    }

    public void setHoursOfWeek(int hoursOfWeek) {
        this.hoursOfWeek = hoursOfWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hoursOfWeek=" + hoursOfWeek +
                '}';
    }
}
