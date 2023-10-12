/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngocbuh.mathutil.main;

import com.ngocbuh.mathutil.core.MathUtility;

/**
 *
 * @author 1005h
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //TEST CASE #1:
        int n = 0; //Tinh huong n = 0!
        long expected = 1; //Ko can lap trinh cung la kq nay
        long actual = MathUtility.getFactorial(n); //Thuc te la may, run la biet lien
        
        //So sanh giua expected == actual hay ko??
        System.out.println("0! -> Expected = " + expected + " | Actual = " + actual);
        //Cach 1: dung mat nguoi so sanh
        
        //TEST CASE #2:
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> Expected = " + expected + " | Actual = " + actual);
        
        //TEST CASE #3:
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println("5! -> Expected = " + expected + " | Actual = " + actual);
    }
    
}
        //DEV phai test code cua minh, co 3 cach:
        //Cach 1: In ket qua xu ly ra man hinh
        
        //Cong viec cua QC bao gom
        //Thiet ke test case, run test case, ghi lai bug neu co
        //         test case  test run              log bug
        //Tes case: noi ra ban se test app the nao
        //bang cach dua vao data, gia tri ky vong, cach dung app voi bo data do
        //Xong run
        
        //De thi PE luon o day || thhiet ke test case
        //Ta thiet ke test case de test ham tinh giai thua ta vua viet
        //Test code dc goi la unit test
        //Test case cho unit test goi la "unit test" test case
        
        //Test case #1: Check getFactorial() with n = 0
        //Steps/Procedures:
        //      1. Given n = 0
        //      2. Invoke/call getFactorial(n = 0)
        
        //Expected result: the method return 1 stands for 0! = 1
        //Status         : PASSED? or FAILED?

        //Test case #2: Check getFactorial() with n = 1
        //Steps/Procedures:
        //      1. Given n = 1;
        //      2. Call/Invoke getFactorial(n = 1)

        //Expected Result
        // The method returns 1 (standin for 1! = 1)
        //Status: PASS? or FAILED?
        
        //Test case #3: Check getFactorial() with n = 5
        //Steps/Procedures:
        //      1. Given n = 1;
        //      2. Call/Invoke getFactorial(n = 1)

        //Expected Result
        // The method returns 120 (standin for 1! = 1)
        //Status: PASS? or FAILED?
