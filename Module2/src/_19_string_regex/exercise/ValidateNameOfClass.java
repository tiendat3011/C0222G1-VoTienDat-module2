package _19_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
    public static void main(String[] args) {
        String NAME_CLASS = "^[CAP]\\d{4}[GHIKLM]$";

        String check1 = "123abc_";
        String check2 = "_abc123";
        String check3 = "______";
        String check4 = "123456";
        String check5 = "C1999K";

        System.out.println(check1 + ": " + Pattern.matches(NAME_CLASS, check1));
        System.out.println(check2 + ": " + Pattern.matches(NAME_CLASS, check2));
        System.out.println(check3 + ": " + Pattern.matches(NAME_CLASS, check3));
        System.out.println(check4 + ": " + Pattern.matches(NAME_CLASS, check4));
        System.out.println(check5 + ": " + Pattern.matches(NAME_CLASS, check5));

    }
}