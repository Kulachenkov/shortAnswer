package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e){
            System.out.println("Dividing by zero is detected");
        } finally{
            System.out.println("The code is executed.");
        }
    }
}
