package com.nikkhat.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Assertion - is a class
 * Assertion-validating expected result with actual.
 *
 * */
public class AssertExamples {

    @Test
    public void test1(){
        System.out.println("testing some assertion methods");
        float expected=12;
        Float actual=12.0f;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void arrayTest(){
        int[] actualIntArray= {1,3,4,5,6};
        int[] expectedIntArray= {1,3,4,5,6};
        Assertions.assertArrayEquals(actualIntArray,expectedIntArray);
    }

    @Test
    public void listTest(){
        List<Integer> expectedList= Arrays.asList(1,3,4,6);
//        List<Integer> actualList= Arrays.asList(1,3,6,4); will fail
        List<Integer> actualList= Arrays.asList(1,3,4,6);
        Assertions.assertIterableEquals(expectedList,actualList);

    }


    @Test
    public void stringTest(){
        String actual= new String("nikkhat");
        String expected= new String("nikkhat");
        Assertions.assertEquals(expected,actual);
        System.out.println("test pass");
    }


    @Test
    public void exceptionTest(){
        Assertions.assertThrows(RuntimeException.class,()->{
            System.out.println("this is testing executable");
            throw new RuntimeException("thi is testing exception");
        });

    }
    @Test
    public void someOtherMethods(){

        //test same object
//        String expectedObject = new String("1");
//        expectedObject = new String("1");
//        Assertions.assertSame(expectedObject,expectedObject);   //test same object
//        String name = null;
//
//        Assertions.assertNull();
//        Assertions.assertNotNull();
//        boolean value=false;
//        Assertions.assertTrue(value);

    }

}
