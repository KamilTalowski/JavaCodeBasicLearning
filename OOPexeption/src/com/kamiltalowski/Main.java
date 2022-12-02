package com.kamiltalowski;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // exception = an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions

        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();
            System.out.println("Enter whole number to divide by");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("result " + z);

        }catch(ArithmeticException e){
            System.out.println("You cant divide by 0");
        }catch(InputMismatchException e){
            System.out.println("Please enter a whole number");
        }catch (Exception e){
            System.out.println("something went wrong");
        }finally {
            System.out.println("this will always print");
            scanner.close();
        }
    }
}
