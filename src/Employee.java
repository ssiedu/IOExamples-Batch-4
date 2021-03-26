
import java.io.Serializable;

public class Employee implements Serializable {
    private int eno;
    private String name;
    private transient int salary;

    public Employee(int eno, String name, int salary) {
        this.eno = eno;
        this.name = name;
        this.salary = salary;
    }
    public void show(){
        System.out.println("EmpCode : "+eno);
        System.out.println("EmpName : "+name);
        System.out.println("Salary  : "+salary);
    }
    
}
