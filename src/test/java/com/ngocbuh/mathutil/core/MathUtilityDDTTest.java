/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngocbuh.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author 1005h
 */
public class MathUtilityDDTTest {
    
    //Tach data kiem thu ra khoi cau lenh so sanh
    //Ky thuat nay goi la DDT - Data driven testing
    //Kiểm thử hàm, app mà tách riêng bộ data để riêng, thường là mảng, excel, table
    
    //0! = 1
    //1! = 1
    //2! = 2
    //3! = 6
    //4! = 24
    //5! = 120
    //Thấy mùi mảng 2 chiều
    
    public static Object[] initData(){
//        int[] a= {Phần tử mảng 1 chiều cách nhau dấu phẩy 5, 10, 15, ...}
        Object[][] testData = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {5,120}
                              //n expected
        };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturns(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
