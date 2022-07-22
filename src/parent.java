/*
Single level inheritance:
 */
public class parent { //Base Class
    int a = 10;
    void display(){
        System.out.println("parent class");
    }

}
 class child extends parent{ // Derived Class
    int b = 20;
    void show(){
        System.out.println("child class");
    }
}
class inherit{
    public static void main(String[] args){
        child obj = new child();
        System.out.println(obj.b);
        obj.show();
        System.out.println(obj.a);
        obj.display();
    }
}
