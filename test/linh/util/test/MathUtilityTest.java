/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linh.util.test;
import java.sql.SQLException;
import static linh.util.MathUtillity.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    //Hàm muốn test - kết quả mong muốn trả về - Yêu cầu
    //Cách đặt tên hàm sẽ nói lên mục tiêu test
    //@Test biến hàm này thành public static void main()
    @Test
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        
    }
    //Cần test coi có ném về ngoại lệ hay không
    //Nếu đúng là ném về ngoiaj lệ IlleglArgumentException trong tình huống giai thừa -5 thì có màu xanh
    @Test(expected = IllegalArgumentException.class)
   public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
   }
   //ngoại lệ không phải là 1 value để đem ra so sánh. Chỉ có thể kiểm tra
   //Coi nó có xuất hiện hay không
}
