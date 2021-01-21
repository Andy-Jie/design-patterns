package com.andy.principle.demo6.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter {

    public static void main(String[] args) {

        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

    }

}

class Employee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                '}';
    }
}

class CollegeEmployee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CollegeEmployee{" +
                "id='" + id + '\'' +
                '}';
    }
}

class CollegeManager{

    public List<CollegeEmployee> getAllCollegeEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("员工"+i);
            list.add(collegeEmployee);
        }

        return list;
    }

    public void printAll(){
        List<CollegeEmployee> list = getAllCollegeEmployee();
        for (CollegeEmployee collegeEmployee : list) {
            System.out.println(collegeEmployee);
        }
    }

}

class SchoolManager{

    public List<Employee> getAllCollegeEmployee(){
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setId("员工"+i);
            list.add(employee);
        }

        return list;
    }

    public void printAllEmployee(CollegeManager collegeManager){

        collegeManager.printAll();

        List<Employee> list1 = getAllCollegeEmployee();
        for (Employee employee : list1) {
            System.out.println(employee);
        }

    }

}







