/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import static linh.util.MathUtillity.getFactorial;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ta test thử hàm của ta
        //Dung mắt để so sánh kết quả thực tế khi chạy và kết quả mong đợi
        long expected=120;// ta mong nhận 120 nếu gọi hàm 5!
        long actual=getFactorial(5);
        System.out.println("5!: Expected: "+expected + "; Actual: "+actual);   
        System.out.println("6!: "+getFactorial(6));
        System.out.println("0!: "+getFactorial(0));
        System.out.println("-1!: "+getFactorial(-1));
        //System.out.println("50!: "getFactorial(50));
    }
    
}