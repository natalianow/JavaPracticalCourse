package Project;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Wprowadź swoje nazwisko");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Twoje nazwisko to: " + name);
    }
}
