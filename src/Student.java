public class Student {
    int id;
    String name;
    void insert(){
        System.out.println("hello im there");
    }
    void display(){
        System.out.println(id + name);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.insert();
        s1.display();
    }
}
