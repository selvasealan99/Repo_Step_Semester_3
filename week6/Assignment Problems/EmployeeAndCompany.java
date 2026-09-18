package week6.assignmentssss;
class Employeee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employeee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeAndCompany {
    public static void main(String[] args) {
        Employeee e1 = new Employeee("Arun", 50000);
        Employeee e2 = new Employeee("Priya", 60000);
        Employeee e3 = new Employeee("Karthik", 55000);

        Employeee.printCompanyInfo();
    }
}