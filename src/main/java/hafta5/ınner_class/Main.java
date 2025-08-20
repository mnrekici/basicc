package hafta5.ınner_class;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmet", "Yılmaz", "0555 123 45 67", "ahmet.yilmaz@example.com");
        Employee emp2 = new Employee("Ayşe", "Kara", "0532 987 65 43", "ayse.kara@example.com");

        emp1.showEmployeeDetails();
        System.out.println("-------------------------");
        emp2.showEmployeeDetails();
    }
}