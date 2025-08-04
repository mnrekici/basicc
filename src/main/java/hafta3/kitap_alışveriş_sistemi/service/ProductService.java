package hafta3.kitap_alışveriş_sistemi.service;

import hafta3.kitap_alışveriş_sistemi.Author;
import hafta3.kitap_alışveriş_sistemi.Product;
import hafta3.kitap_alışveriş_sistemi.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ProductService {

    private static List<Product> productList = new ArrayList<>();

    public void create(String name, double price, Author author, LocalDate publishedDate){
        Product product = new Book (name, price, author, publishedDate);
        productList.add(product);

    }

    public void list(){
        for(Product product : productList){
            System.out.println(product);
        }
    }
}
