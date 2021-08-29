package Assainment_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name: ");
        String name = input.next();
        System.out.print("what is your university name: ");
        String varsity = input.next();
        System.out.println("Hello, I am "+name+".I passed from "+varsity +" university.");
    }
}
