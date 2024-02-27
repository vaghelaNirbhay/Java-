public class p5 {
    String name;

    p5(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        p5 obj = new p5("John");
        obj.displayName();
    }
}
