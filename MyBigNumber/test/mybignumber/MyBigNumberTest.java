/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybignumber;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Box
 */
public class MyBigNumberTest implements IReceiver{
    
    
    
    @Test
    public void test1() {
        
            System.out.println("Test 1 :");
            String str1 = "1";
            String str2 = "2";
            String expResult = "3";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
            
        
    }

    @Test
    public void test2() {
        
            System.out.println("Test 2 :");
            String str1 = "8";
            String str2 = "9";
            String expResult = "17";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
            assertEquals(expResult, result);
        
    }

    @Test
    public void test3() {
        
            System.out.println("Test 3 :");
            String str1 = "10";
            String str2 = "8";
            String expResult = "18";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
            
    }

    @Test
    public void test4() {
        try {
            System.out.println("Test 4 :");
            String str1 = "12a";
            String str2 = "44";            
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    @Test
    public void test5() {
        
        try {
            System.out.println("Test 5 :");
            String str1 = "-12a";
            String str2 = "44)";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    @Test
    public void test6() {
        try {
        System.out.println("Test 6 :");
        String str1 = "-12";
        String str2 = "-10";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    @Test
    public void test7() {
       
        try {
            System.out.println("Test 7 :");
            String str1 = "12";
            String str2 = "45fd";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    @Test
    public void test8() {
       
        try {
            System.out.println("Test 8 :");
            String str1 = "32";
            String str2 = "-45";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    @Test
    public void test9() {
        try {
        System.out.println("Test 9 :");
        String str1 = "991";
        String str2 = "-12s";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    @Test
    public void test10() {
        
        System.out.println("Test 10 :");
        String str1 = "";
        String str2 = "";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
    }
    
    
    @Override
    public void send(String msg) {
        System.out.println(msg + "\n");
    }

    
}