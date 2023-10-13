package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginUtils {

    private static Properties properties;

    private static void initProperties() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("local.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("You need to create it from local.properties.TEMPLATE file.");
        }

    }

    static String getOwnerEmail() {
        initProperties();
        return properties.getProperty("local.owner.email");
    }

    static String getOwnerPassword() {
        initProperties();
        return properties.getProperty("local.owner.password");
    }

    static String getUserEmail() {
        initProperties();
        return properties.getProperty("local.user.email");
    }

    static String getUserPassword() {
        initProperties();
        return properties.getProperty("local.user.password");
    }

}
