package exam_10th_Feb_challenge3;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        // Setting values using setters
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        // Getting values using getters
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
