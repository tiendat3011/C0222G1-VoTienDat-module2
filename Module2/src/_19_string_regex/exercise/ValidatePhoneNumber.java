package _19_string_regex.exercise;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String PHONE_NUMBER = "^(84)-(0)\\d{9}$";
        String check1 = "84-0336761813";
        String check2 = "84-3256841256";
        String check3 = "55015648";
        String check4 = "123456";
        String check5 = "84-01653178030";

        System.out.println(check1 + ": " + Pattern.matches(PHONE_NUMBER, check1));
        System.out.println(check2 + ": " + Pattern.matches(PHONE_NUMBER, check2));
        System.out.println(check3 + ": " + Pattern.matches(PHONE_NUMBER, check3));
        System.out.println(check4 + ": " + Pattern.matches(PHONE_NUMBER, check4));
        System.out.println(check5 + ": " + Pattern.matches(PHONE_NUMBER, check5));
    }
}
