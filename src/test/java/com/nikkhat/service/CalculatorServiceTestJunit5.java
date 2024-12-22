package com.nikkhat.service;

import org.junit.jupiter.api.*;

import java.util.Date;
/**
 * Junit5 - composed with 3 modules
 *  1-JunitPlatform-responsible for launching testing framework on JVM
 *  2-JunitJupiter-
 *      new programming & extension model,
 *      new annotations
 *      test engine implementation
 *
 *  3-JunitVintage-provide support for junit3 & 4
 *
 *
 */

public class CalculatorServiceTestJunit5 {

    int counter =0;
    @BeforeAll
    public static void  init(){
        System.out.println("Before all test case");
        System.out.println(" start date time "+new Date());
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("before each test case");
    }

    @BeforeEach
    public void beforeEach(){
        counter=0;

    }

    @Test
    @Disabled
    public void addTest(){

        for(int i=1;i<=20;i++){
            counter+=i;
        }
        int actual = CalculatorService.add(10, 20);
        int expected=30;
        Assertions.assertEquals(expected, actual);

        System.out.println("counter in test case1 case=> "+counter);
    }

    @Test
    public void calculateAnyNumTest(){

        for(int i=1;i<=100;i++){
            counter+=i;
        }
        int actual = CalculatorService.calculateAnyNum(1, 2, 3, 4);
        int expected=10;
        Assertions.assertEquals(expected,actual);
        System.out.println("counter in test case2 case count=> "+counter);
    }

    @Test
    public void subTest(){
        int actual = CalculatorService.sub(20, 10);
        int expected=10;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multiplicationTest(){
        int actual = CalculatorService.multiplication(5, 5);
        int expected=25;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void division(){
        int division = CalculatorService.division(2, 2);
        int expected=1;
        Assertions.assertEquals(expected,division);
    }

}
