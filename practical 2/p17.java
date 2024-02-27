public class p17 {
    public static void main(String[] args) {
        MyClass1 c1= new MyClass1();
        MyClass2 c2 = new MyClass2();
    
        String r1 = c1.m1("Hello");
        int r2 = c2.m2(5, 3);
        
        System.out.println("Result from MyClass1: " + r1);
        System.out.println("Result from MyClass2: " + r2);
    }
}

class MyClass1 {
    public String m1(String input) {
        return input.toUpperCase();
    }
}

class MyClass2 {
    public int m2(int a, int b) {
        return a * b;
    }
}
