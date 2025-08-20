package hafta5.ınner_class;

public class Employee {
    private String name;

    private String surname;

    private ContactInfo contactInfo;

    public Employee(String name, String surname, ContactInfo contactInfo) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = contactInfo;
    }

    public Employee(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = new ContactInfo(phone, email);

    }

    public class ContactInfo{
        private String phone;

        private String email;

        public ContactInfo(String phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }
    }
    public void showEmployeeDetails() {
        System.out.println("Çalışan: " + name + " " + surname);
        System.out.println("Telefon: " + contactInfo.getPhone());
        System.out.println("E-posta: " + contactInfo.getEmail());
    }
}
