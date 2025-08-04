package hafta3.kitap_alışveriş_sistemi.service;

import hafta3.kitap_alışveriş_sistemi.Author;
import hafta3.kitap_alışveriş_sistemi.enums.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    private static Map< String, Author> authors = new HashMap();

    public void create(String name, String surname, Gender gender){

        Author author = new Author(name, surname, gender);
        authors.put(author.getName(), author);
    }

    public Author findAuthor(String name){
        return authors.get(name);
    }
}
