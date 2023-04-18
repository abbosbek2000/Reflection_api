package uz.spring;

import uz.spring.entity.User;
import uz.spring.service.UserService;

public class App1 {
    public static void main(String[] args) {
        //Java Reflection APi

        //method - 1
        try {
            Class<?> aClass = Class.forName("uz.spring.entity.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //method - 2
        User user = new User();
        Class<? extends User> userClass = user.getClass();

        //method - 3

        Class<User> userClass1 = User.class;
        System.out.println(userClass1);

        Class<UserService> userServiceClass = UserService.class;
        System.out.println(userServiceClass);

    }
}
