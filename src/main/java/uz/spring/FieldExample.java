package uz.spring;

import uz.spring.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class FieldExample {
    public static void main(String[] args) {
        Class<User> userClass = User.class;

        Field[] fields = userClass.getFields();
        System.out.println(Arrays.toString(fields));

        User user1 = new User("abbos", "abbos123", 23);
        User user2 = new User("axror", "axror", 23);

        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (!Modifier.isPublic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
            }
            try {
                Object value = declaredField.get(user1);
                System.out.println("value = " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
