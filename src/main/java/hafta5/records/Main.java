package hafta5.records;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmet", "Kaya",1000);
        Student s2 = new Student("Ayşe", "Kara",1001);
        Student s3= new Student("Ahmet","Kaya",1000);

        System.out.println("Öğrenciler:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Equals ve HashCode Testi:");
        System.out.println("s1.equals(s2): "+ s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s3.hashCode(): " + s3.hashCode());

    }
}
