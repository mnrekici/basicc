package hafta3.kitap_alışveriş_sistemi;

import hafta3.kitap_alışveriş_sistemi.enums.Gender;

import java.time.LocalDate;

public class User {
    private String name;

    private String email;

    private String password;

    private Gender gender;

    private LocalDate birthDay;

    private LocalDate createdDate;

    private boolean isActive;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.createdDate = LocalDate.now();
        this.isActive = true;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public boolean isActive() {
        return isActive;
    }
}
