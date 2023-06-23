import java.util.*;

public class Main {
    public static void menu() {
        System.out.println("""
           **** Welcome To Employee Management System ****\s
           1. Add Employee\s
           2. View Employee
           3. Update Employee
           4 .Delete Employee
           5. View All Employee
           6. Exist\s""");
    }
    public static void main(String[] args) {
        EmloyeeMangement service = new EmloyeeMangement();
        Scanner sc=new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Employee");
                    service.addEmp();
                }
                case 2 -> {
                    System.out.println("View Employee");
                    service.viewEmp();
                }
                case 3 -> {
                    System.out.println("Update Employee");
                    service.updateEmployee();
                }
                case 4 -> {
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                }
                case 5 -> {
                    System.out.println("view All Employee");
                    service.viewAllEmps();
                }
                case 6 -> {
                    System.out.println("Thank you for using application!!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid choice");
            }
        }while(true);

    }
    }
