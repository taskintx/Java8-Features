package javafeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String empId;
    private String empName;
    private String dob;
    private int age;
    private double salary;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String empId, String empName, String dob, int age, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
    }
}

public class Test{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("101","John1","01/01/1991",22,500);
        Employee e2 = new Employee("102","John2","01/01/1992",33,150000);
        Employee e3 = new Employee("103","John3","01/01/1993",24,250000);
        Employee e4 = new Employee("104","John4","01/01/1994",25,50);
        Employee e5 = new Employee("105","John5","01/01/1995",56,450000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        List<Employee> employeesWithAgeGreaterThan30 = employeeList.stream().filter(employee -> employee.getAge()  > 30)
                .collect(Collectors.toList());
        List<Employee> employeesWithAgeBetween50And60 = employeeList.stream().filter(employee -> employee.getAge()  > 50 && employee.getAge()<60)
                .collect(Collectors.toList());
        List<Employee> employeesWithSalaryGreaterThan10000 = employeeList.stream().filter(employee -> employee.getSalary()  > 10000)
                .collect(Collectors.toList());

        System.out.println("Age greater than 30");
        employeesWithAgeGreaterThan30.forEach(employee -> System.out.println(employee));
        System.out.println("--------------------------\n");

        System.out.println("Age between 50 and 60");
        employeesWithAgeBetween50And60.forEach(employee -> System.out.println(employee));
        System.out.println("--------------------------\n");

        System.out.println("Salary over 10000");
        employeesWithSalaryGreaterThan10000.forEach(employee -> System.out.println(employee));
        System.out.println("--------------------------");

    }
}