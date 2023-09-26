import Greet.Greet;

public class Main {
    public static void main(String[] args) {
        Greet gre = new Greet();
    }

    @Test
    public void test(){
        Greet gre = new Greet();
        Assert.assertEquals("Hello", gre.says());
    }
}