public class p9 {
    String name;
    int age;

    p9(String name,int age){
        this.name = name;
        this.age = age;
    }

    p9(p9 obj){
        name = obj.name;
        age = obj.age;
    }

    void display(){
        System.out.println("Name : " + name + " Age : " + age);
    }

    public static void main(String args[]){
        p9 obj1 = new p9("Rohan" ,15);
        p9 obj2 = new p9(obj1);

        obj2.display();
    }
}
