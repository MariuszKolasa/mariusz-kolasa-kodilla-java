package com.kodilla.testing.collection;
import java.util.*;
public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersWithoutOddNumbers = new ArrayList<>();
        if (numbers==null) {
            System.out.println("Zbiór liczb jest pusty");
        }else {


            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    numbersWithoutOddNumbers.add(number);
                }
            }
        }
        return numbersWithoutOddNumbers;
    }
}