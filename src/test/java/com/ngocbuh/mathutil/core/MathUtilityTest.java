/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngocbuh.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1005h
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        //Test case template/structure:
        //ID | DESC | Steps/procedure | Expected value | status (PASS/FAIL)
        
          
    }
    
    //Test case #1: Verify the getfactorial() function with n = 0
        //Steps/procedure
        //  1. Given n 0
        //  2. Call/invoke getFactorial(int n)
        //Expected result
        //  The method getFactorial(n = 0) must return 1
        //              as the result of 0! = 1
        //Status, PASSED | FAILED đoán xem khi chạy app, hàm 
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #2: n = 6
    @Test
    public void verifyFactorialGivenRightArgument6ReturnsOk(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
    
}
