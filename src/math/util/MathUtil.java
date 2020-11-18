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
        System.out.println("Goodbye and good lunk to you all in the final exam");
        System.out.println("Hope that you all will get the GREEN ICONS");
        //System.out.println("50!: "getFactorial(50));
        
        //Muốn kết luận hàm mình ngon, thì ta phải nhìn bằng mắt kết quả chạy của hàm 
        //và so sánh với kì vọng
        //làm từng trường hợp chạy hàm - test case 
        //cách này ổn nhưng mất sức
        //ADVANCED : Dùng màu sắc, xanh, đỏ để kết luận 
        //Ta thấy xanh, Hàm ý mọi tình huống ổn
        //Ta thấy đỏ, chỉ 1 thằng màu đỏ, coi như hàm toang
        //Ta xaaif thêm 1 FRAMEWORK, Unit Test nói chung
        //JUNIT, TESTING, NUNIT, ... là những FRAMEWORK cụ thể để giúp test các hàm một cách hiệu quả
        //Dùng nó ta hợp vào 1 quy trình làm phần mềm lớn hơn - CI/CT/CD/DEVOPS
        
    }
    
}
