import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmloyeeMangement  {
    HashSet<Employee> empset= new HashSet<>();
    Scanner sc = new Scanner(System.in);
    boolean found=false;


    public void addEmp() {
        System.out.println("Enter your ID : ");
        int id=sc.nextInt();
        System.out.println("Enter your name : ");
        String nom=sc.next();
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        System.out.println("Enter your departement : ");
        String departement=sc.next();
        System.out.println("Enter your job title : ");
        String jobtitle=sc.next();
        System.out.println("Enter your salaire : ");
        double salaire=sc.nextDouble();

        Employee emp=new Employee(id, nom, age, departement, jobtitle, salaire);

        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employtee addeed successsfully");

    }
    public void deleteEmp() {
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        boolean found=false;
        Employee empdelete=null;
        for(Employee emp:empset) {
            if(emp.getId()==id) {
                empdelete=emp;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Employee is not found");
        }
        else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }
    public void updateEmployee() {
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        boolean found=false;
        for(Employee emp:empset) {
            if(emp.getId()==id) {
                System.out.println("Enter new name: ");
                emp.setNom(sc.next());
                System.out.println("Enter new age: ");
                emp.setAge(sc.nextInt());
                System.out.println("Enter new departement: ");
                emp.setDepartement(sc.next());
                System.out.println("Enter new job title: ");
                emp.setJobtitle(sc.next());
                System.out.println("Enter new salaire:");
                emp.setSalaire(sc.nextDouble());
                System.out.println("Updated Details of employee are: ");
                System.out.println(emp);
                System.out.println("Employee details updated successfully !!");
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("Employee not found.");
        }
    }
    public void viewAllEmps() {
        for(Employee emp:empset) {
            System.out.println(emp);
        }
    }
    public void viewEmp(){
        System.out.println("Enter ID: ");
        int id=sc.nextInt();
        for(Employee emp:empset) {
            if(emp.getId()==id) {
                System.out.println(emp);
                found=true;
            }
        }
        if(!found) {
            System.out.println("Employee with the id : "+id+" is not found, Thank you.");
        }
    }
}
