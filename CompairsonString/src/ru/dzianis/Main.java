package ru.dzianis;

public class Main {

    public static void main(String[] args) {
        String str1, str2;
        str1 = "Java";
        str2 = str1;

        System.out.println("comparison of references " + (str1 == str2)); //return true
        str2 = "Java"; // new references
        System.out.println("comparison of references " + (str1 == str2)); //return false
        System.out.println("comparison of values " + str1.equals(str2)); //return true
    }
}
