import org.junit.*;


// public class Greet{
//     public String says(){
//         return "Hello";
//     }
// }

public class GreetTest {
    public String says(){
        return "Hello";
    }
    @Test
    public void test(){
        GreetTest gre = new GreetTest();
        Assert.assertEquals("Hello", gre.says());
    }
}