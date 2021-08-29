package Assainment_1;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("1st input: ");
        int a = input.nextInt();
        System.out.print("2nd input: ");
        int b = input.nextInt();
        System.out.print("3rd input: ");
        int c = input.nextInt();
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("Total value: "+sum);
        System.out.println("Average value "+average);

    }
}
