package hafta2.student_information_system;

public class Teacher {
    private String name;

    private String surname;

    private String phone;

    private Course course;

    public Teacher(String name, String surname, String phone, Course course) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", course=" + course +
                '}';
    }
}
