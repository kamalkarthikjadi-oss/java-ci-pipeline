package com.example;

public class App 
{
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main( String[] args )
    {
        System.out.println("Hello CI Pipeline!");
        System.out.println("Sum: " + add(5, 3));
    }
}