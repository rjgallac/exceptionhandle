package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int test = 10 / 0;
        }catch(Exception e){
            throw new RuntimeException();
        }
        System.out.println("Hello world!");
    }
}