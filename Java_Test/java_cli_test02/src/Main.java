import GreetTools.*;

public class Main {
    public static void main(String[] args) {
        Greet gre = new Greet();
        System.out.println("Hello, "+gre.says());
    }

    @Test
    public void test(){
        Greet gre = new Greet();
        Assert.assertEquals("Hello", gre.says());
    }
}