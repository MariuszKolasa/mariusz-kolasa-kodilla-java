package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallang = new SecondChallenge();
        try {
            secondChallang.probablyIWillThrowException(2.3, 1.5);
        } catch(Exception e){
            System.out.println("x >= 2 || x < 1 || y == 1.5");
        } finally {
            System.out.println("Let's move on.");
        }
    }
}
