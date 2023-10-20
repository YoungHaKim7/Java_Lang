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

class Contact03 {
    String fullName;
    short since;
    
    Contact03(String fullName, short since) {
        this.fullName = fullName;
        this.since = since;
    }

    public String info() {
        return this.fullName + " since: " + this.since;
    }
}

class Contact04 implements BusinessCard {
    String fullName;
    short since;
    
    Contact04(String fullName, short since) {
        this.fullName = fullName;
        this.since = since;
    }

    public String info() {
        return this.fullName + " since: " + this.since;
    }

    public String card() {
        return "Business Card: " + this.fullName;
    }
}

interface BusinessCard {
    public String card();
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
        Main.contactString06();
        Main.contactString07();
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

    public static void contactString06() {
        var c1 = new Contact03("John Doe", (short) 2005);
        System.out.println("Hello " + c1.info());
    }
    
    public static void contactString07() {
        var c1 = new Contact04("John Doe", (short) 2005);
        System.out.println("Hello " + c1.card());
    }
    
} 
