package hafta3.kitap_alışveriş_sistemi.service;

import hafta3.kitap_alışveriş_sistemi.Author;
import hafta3.kitap_alışveriş_sistemi.enums.Gender;

import java.time.LocalDate;

public class PatikaBooks {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.create("munire","munirekici.com","password");
        userService.create("ayşe","ayşe.com","password1");
        userService.create("fatma","fatma.com","password2");
        userService.list();

        AuthorService authorService = new AuthorService();
        authorService.create("Patika", "Patika", Gender.WOMEN);
        Author author = authorService.findAuthor("Patika");

        ProductService productService = new ProductService();
        productService.create("Java programlama", 155, author, LocalDate.of(2022, 1,1));
        productService.create("Java programlama-2 ", 255, author, LocalDate.of(2023, 1,1));
        productService.create("Java programlama", 355, author, LocalDate.of(2024, 1,1));

        productService.list();




    }
}
