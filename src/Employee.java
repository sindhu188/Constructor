import java.sql.SQLOutput;

public class Employee {
    int id;
    String name;
    String add; // Data member or instance variable

    static void getEmployeeName(){

    }
    public static void main(String[] args){
        Employee e = new Employee();
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.add);
        Employee.getEmployeeName();
        }


    }

