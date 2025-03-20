package HW10.step2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class UserJsonCreator {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("file.txt"))) {
            if (scanner.hasNextLine()) scanner.nextLine(); // Пропускаємо заголовок
            while (scanner.hasNext()) {
                String name = scanner.next();
                if (scanner.hasNextInt()) {
                    int age = scanner.nextInt();
                    users.add(new User(name, age));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("user.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(users);
            fos.write(json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}