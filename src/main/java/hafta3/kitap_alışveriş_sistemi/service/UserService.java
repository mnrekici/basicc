package hafta3.kitap_alışveriş_sistemi.service;

import hafta3.kitap_alışveriş_sistemi.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>();

    public void create(String name, String email, String password ){
        User user = new User(name, email, password);

        users.add(user);


    }

    public void list(){
        for (User user : users){
            System.out.println(user.getName()+ "->" + user.getEmail());
        }
    }
}
