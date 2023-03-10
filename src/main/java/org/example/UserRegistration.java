package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public static boolean lastName(String lastName){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();

    }

    public  static boolean email(String mail) {
        String regex = "^[a-z A-Z 0-9]+([.][a-z A-Z 0-9]{1,})?[@][a-z A-Z]+[.][a-z A-Z]{2,3}([.][a-z A-Z]{1,2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();

    }

    public static boolean mobileNumber(String mobNo) {
        String regex = "^[+]?(91)[\\s][0-9]{10}$"; // 91 {10digit}
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNo);
        return matcher.matches();

    }

    public  static boolean password(String password) {
        String regex = "^[a-z A-Z 0-9 _@./#&+-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
}


