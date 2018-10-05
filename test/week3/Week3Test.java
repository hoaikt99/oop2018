package week3;
import org.junit.Test;
import org.junit.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void maxtest(){

        Assert.assertEquals(4, Week3.max(3,4));
        Assert.assertEquals(100, Week3.max(100,568));
        Assert.assertEquals(12, Week3.max(25,12));
        Assert.assertEquals(7895, Week3.max(7895,623));
        Assert.assertEquals(450, Week3.max(3,450));

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void minOfArraytest(){
        int a1[]={2,8,6,4,3,7,1},a2[]={8895,547,2216,249,153},a3[]={8925,451,662154,112};
        int a4[]={125,148,364,458,657,6242,652,12,48}, a5[]={565,124,3365,541,0,99,1862,6452,33668,11544,122562,15};
        Assert.assertEquals(1,Week3.minOfArray(a1));
        Assert.assertEquals(153,Week3.minOfArray(a2));
        Assert.assertEquals(112,Week3.minOfArray(a3));
        Assert.assertEquals(12,Week3.minOfArray(a4));
        Assert.assertEquals(0,Week3.minOfArray(a5));
    }
        
        
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
        
        
        @Test
    public void calculateBMItest(){
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(36.5,1.47));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(56.6,1.7));
        Assert.assertEquals("Thừa cân", Week3.calculateBMI(58.4,1.56));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(72.3,1.65));
        Assert.assertEquals("Thừa cân", Week3.calculateBMI(67.8,1.66));
        
    }
}
