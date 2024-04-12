package utils;

import student.Student;

public class Utils {

    private Utils() {}


    public static String generateRandomEmail(){
        return System.currentTimeMillis() + "@email.com";
    }

    public static void main(String[] args) {
        //Student student = new Student();
        //student.ime = "Pera";
    }

}
