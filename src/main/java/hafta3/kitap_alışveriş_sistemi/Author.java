package hafta3.kitap_alışveriş_sistemi;

import hafta3.kitap_alışveriş_sistemi.enums.Gender;

import java.time.LocalDate;

public class Author {

    private String name;

    private String surname;

    private Gender gender;

    private LocalDate birthday;

    private String bio;

    public Author(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender =gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirtday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", bio='" + bio + '\'' +
                '}';
    }
}
