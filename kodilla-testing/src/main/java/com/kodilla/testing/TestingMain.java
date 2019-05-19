package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){


        //zadanie test kalkulatora
        Calculator calculator=new Calculator();
        double addAtoB=calculator.add(1,1);
        double substractBfromA=calculator.substract(2,2);
        if(addAtoB==2.0) {
            System.out.println("add metod test OK");
        }else {
            System.out.println("add metod test Failed");
        }
        if(substractBfromA==0) {
            System.out.println("substract metod test OK");
        }else{
            System.out.println("substract metod test Failed");
        }





    }
}