package Assainment_1;

import java.util.Scanner;

public class TestFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = input.nextInt();
        System.out.print("Enter value b: ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Result: " + (int)(Math.pow(c,2)));
    }
}
