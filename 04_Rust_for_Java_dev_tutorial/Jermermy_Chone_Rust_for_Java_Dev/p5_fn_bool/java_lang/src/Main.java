class Contact {
    String fullName;
    short since;
}


class Contact02 {
    String fullName;
    short since;
    Contact02(String fullName, short since) {
        this.fullName = fullName;
        this.since = since;
    }
}

public class Main { 
    public static void main(String[] args) { 
        Main.sayHello();
        Main.sayIf();
        Main.sayIf2();
        Main.strString01();
        Main.strString02();
        Main.strString03();
        Main.contactString04();    
        Main.contactString05();    
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

    public static void strString02() {
        String fullName = new String("John Doe");
        System.out.println("Hello " + fullName);
    }

    public static void strString03() {
        var fullName = new StringBuilder("John");
        fullName.append(" Doe");
        System.out.println("Hello " + fullName);
    }

    public static void contactString04() {
        var c1 = new Contact();
        c1.fullName = "John Doe";
        c1.since = 2005;
        System.out.println("Hello " + c1.fullName + " since: " + c1.since);
    }
    
    public static void contactString05() {
        var c1 = new Contact02("John Doe", (short) 2005);
        System.out.println("Hello " + c1.fullName + " since: " + c1.since);
    }
} 
