public class Main { 
    public static void main(String[] args) { 
        Main.sayHello();
        Main.sayIf();
        Main.sayIf2();
        Main.strString01();
    } 

    // Boolean
    public static void sayHello() {
        boolean coding01 = true;
        System.out.println("Hello world!  " + coding01);
    }

    public static void sayIf() {
        boolean coding02 = true;
        String mood;
        if (coding02) {
            mood = "happy";
        } else {
            mood = "sad";
        }
        System.out.println("Hello world!!" + mood);
    }

    public static void sayIf2() {
        boolean coding03 = true;
        String mood2 = (coding03) ? "happy" : "sad";
        System.out.println("Hello world!! if 02" + mood2);
    }

    public static void strString01() {
        String fullName = "John Doe";
        System.out.println(" Hello " + fullName);
    }

} 
