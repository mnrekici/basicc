package hafta2.student_information_system;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course mathCourse = new Course("Matematik", "Mat101", 8);
        Course pyhsicCourse = new Course("Fizik", "Fizik101", 6);
        Course chemistryCourse = new Course("Kimya", "Kimya101", 5);
        Course biologyCourse = new Course("Biyoloji", "Biyo101", 4);
        Course englishCourse = new Course("İngilizce", "İng101", 9);

        Course[] courses = new Course [5];
        courses[0]= mathCourse;
        courses[1]= pyhsicCourse;
        courses[2]= chemistryCourse;
        courses[3]= biologyCourse;
        courses[4]= englishCourse;

        Teacher[] teachers = new Teacher [5];
        Teacher mathTeacher = new Teacher("Ali", "Ak", "5553332211", mathCourse);
        Teacher pyhsicTeacher = new Teacher("Ayşe", "Sarı", "5552221133",pyhsicCourse);
        Teacher chemistryTeacher = new Teacher("Ahmet", "Beyaz", "5553332244", chemistryCourse);
        Teacher biologyTeacher = new Teacher("Arzu", "Kırmızı", "5553332213", biologyCourse);
        Teacher englishTeacher = new Teacher("Kamil", "Turan", "5554441030", englishCourse);

        teachers[0]=mathTeacher;
        teachers[1]=pyhsicTeacher;
        teachers[2]=chemistryTeacher;
        teachers[3]=biologyTeacher;
        teachers[4]=englishTeacher;


        mathCourse.setTeacher(mathTeacher);
        pyhsicCourse.setTeacher(pyhsicTeacher);
        chemistryCourse.setTeacher(chemistryTeacher);
        biologyCourse.setTeacher(biologyTeacher);
        englishCourse.setTeacher(englishTeacher);

        mathTeacher.setCourse(mathCourse);
        pyhsicTeacher.setCourse(pyhsicCourse);
        chemistryTeacher.setCourse(chemistryCourse);
        biologyTeacher.setCourse(biologyCourse);
        englishTeacher.setCourse(englishCourse);

        Student student1= new Student("münire", "ekici", LocalDate.of(2002, 9,2),001);
        Student student2= new Student("ayşe", "paksoy", LocalDate.of(2001, 12, 25), 002);
        Student student3= new Student("ahmet", "aslan", LocalDate.of(1999, 7, 30), 003);
        Student student4= new Student("aslı", "konak", LocalDate.of(1994, 2, 12), 004);

        Student[] students = new Student[4];
        students[0]= student1;
        students[1]= student2;
        students[2]= student3;
        students[3]= student4;

        student1.setCourses(courses);
        student2.setCourses(courses);
        student3.setCourses(courses);
        student4.setCourses(courses);

        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }

        for (Course course: courses){
            System.out.println(course);
        }

        for(Student student: students){
            System.out.println(student);
        }

        student1.addCourse(mathCourse, 0);
        student1.addCourse(pyhsicCourse, 1);
        student1.addCourse(biologyCourse, 2);
        student1.addCourse(chemistryCourse, 3);
        student1.addCourse(englishCourse, 4);








    }
}
