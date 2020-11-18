/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linh.util;

/**
 * ACTUAL : KQ trả về so vs EXPECTED
 * TDD: viết code khác để test code chính . Hai việc này phải làm song song. Chỉ việc nhìn màu để kết luận đúng sai.
 * @author LINH
 */
public class MathUtillity {
    //Class này fake clss Math của JDK
    // .abs() .sqrt() .sin() .PI
    //Chúng toàn là static, vì là thư viện dùng chung
    public static final double PI=3.1415;
    
    //Hàm tính giai thừa
    //0! = 1!=1
    //Mình không tính được giai thừa âm 
    //21! cực lớn, tràn kiểu long,chứa không nổi
    //int: tối đa 2 tỷ 1 mấy
    //Hàm tính giai thừa trong giới hạn đầu vào từ 0-20
//    public static long getFactorial(int n){
//        if(n<0 || n>20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        if(n==0 || n==1)
//            return 1;
//        long result=1;
//        for (int i = 2; i <= n; i++) {
//            result*=i;
//        }
//        return result;
//        //return n*getFactorial(n-1);
//    }
    //Viết đệ quy cho hoành tráng
    //GỌi lại chính mình với 1 quy mô khác
    //5! = 5 x 4!, bắt tính 5!, khoan, đi tính 4! rồi tính tiếp
    //4! = 4 x 3!, mún tính 4!, khoan, đi tính 3! rồi tính tiếp
    //...........
    //-> Rất dễ bị lặp vô tận nếu không có dừng
    //1!=1, quy ước rồi, dừng, hồi ngược lại lên trên tra 5!
    //n!=n*(n-1)!
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        return n*getFactorial(n-1);
    }
    
    /*
    Minh họa khái niệm Refactoring - tối ưu, chỉnh sửa lại code cho tốt hơn
    và minh họa khái niệm Regression Test, test hồi quy, test lại những gì đã từng test XANH, để check xem code còn XANH như ngày xưa không.
    */
    
}
