/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngocbuh.mathutil.core;

/**
 *
 * @author 1005h
 */
//Class nay chua cac ham static dung chung cho moi noi
//khi nao dung static: khi ta can cac ham ma chi xu ly roi return
//koo can luu thong tin vao instance variable - dac tinh cua objeect
public class MathUtility {

    public static final double PI = 3.14;

    //ham tinh n!
    //ko tinh dc giai tthua so am
    //0!=1
    //vi giaithua tang rat nhat, 21! kieu long ko chua noi (vuot 18 so 0)
    
    //do do ham getF() nay chi choi vs n = 0..20
    
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        
        if (n == 0 || n == 1) 
            return 1; //Neu n dac biet, ta return som luon
        //Tối ưu code, thay ruột của khách hàng để chạy ngon hơn
        //Nhanh hơn hoặc code viết đẹp hơn
        //Hoặc fix bug phải sửa code
        //Dù sửa code vì lý do gì, code phải được test lại, và test lại để đảm bảo rằng nó vẫn sai như lần trc
        //Nếu ta viết code kèm script thì việc test lại cực nhanh
        
        return n * getFactorial(n-1); //Đệ quy
    }
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
//        
//        if (n == 0 || n == 1) 
//            return 1; //Neu n dac biet, ta return som luon
//        
//        long result = 1;//song sot den lenh nay => n >=2
//
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//
//        return result;
//    }
    
}
