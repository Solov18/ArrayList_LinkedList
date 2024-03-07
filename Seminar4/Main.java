package com.javacurse.ce.JavaDevelopmentKit.JavaDevelopmentKitSeminar.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee Ivan = new Employee(001,11111, "Иван", 6);
        Employee Igor = new Employee(002,22222, "Игорь", 5);
        Employee Sveta = new Employee(003,33333, "Света", 4);
        Employee Ramzan = new Employee(004,44444, "Рамзан", 3);
        Employee Olga = new Employee(005,55555, "Ольга", 3);

        List<Employee> list = new ArrayList<>();
        list.add(Ivan);
        list.add(Igor);
        list.add(Sveta);
        list.add(Ramzan);
        list.add(Olga);

        list.size();
        list.set(0,Igor);


        addEmployee(list,006,66666,"Генадий", 11);

        System.out.println(Search_by_Experience(list,4));
        System.out.println(Search_by_Telephone(list, "Иван"));
        System.out.println(Search_by_TabNumber(list,002));
        System.out.println(list.set(0,Ivan));




    }

    public static String Search_by_Telephone(List<Employee> list, String name){
        for (Employee employee : list ) {
            if (employee.getName() == name) {
                return String.valueOf(employee.getTelephone());
            }


        }
        return null;
    }
    public static Employee Search_by_Experience(List<Employee> list, int experience){
        for (Employee employee : list ) {
            if (employee.getExperience() == experience) {
                return employee;
            }


        }
        return null;
    }
    public static Employee Search_by_TabNumber(List<Employee> list, int tabNumber){
        for (Employee employee : list ) {
            if (employee.getTabNumber() == tabNumber) {
                return employee;
            }


        }
        return null;
    }
    public static void addEmployee(List<Employee> employees, int tabNumber, int telephone,String name,int experience) {
        Employee newEmployee = new Employee(tabNumber,telephone,name,experience);
        employees.add(newEmployee);
    }

}
