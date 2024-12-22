package com.nikkhat.service;

public class CalculatorService {

    public static int add(int a,int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int multiplication(int a,int b){
        return a*b;
    }


    public static int division(int a,int b){
        return a/b;
    }

    public static  int calculateAnyNum(int ...numbers){
        int s=0;
        for (int n:numbers) {
            s+=n;
        }
        return s;
    }
}
