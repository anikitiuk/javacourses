package com.hillel.generics;

import com.hillel.Inheritance.Employee;
import com.hillel.Inheritance.Manager;
import com.hillel.Inheritance.Person;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by ANikitiuk on 25.06.2015.
 */
public class GenericsMain {
    public static void main(String[] args) {
        Person person = new Person("Ed");
        Employee employee = new Employee("Ted", "IT");
        Manager manager = new Manager("Tom", "Management");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

        //printDepartment(persons);
        printDepartment(employees);
        printDepartment(managers);

        addEmployee(employees);
        addEmployee(persons);
    }

    public static void addEmployee(List<? super Employee> employees){
        employees.add(new Employee("Ivan", "Stuff"));
    }

    public static void printDepartment(Employee employee) {
        System.out.println(employee.getDepartment());
    }

    public static void printDepartment(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getDepartment());
        }
    }

    private static void pairUsage() {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        Integer first = pair.getFirst();

        String second = pair.getSecond();

        System.out.println(first + ", " + second);
    }

    private static void inheritanceAndGenerics() {
        List<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(1);
        listIntegers.add(2);
        //listIntegers.add("3");

        for (Object o : listIntegers) {
            Integer i = (Integer) o;
            //System.out.println(o);
        }

        Person person = new Person("Ed");
        Employee employee = new Employee("Ted", "IT");
        Manager manager = new Manager("Tom", "Management");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

        //employee = manager;

        //employees = (List)managers;

        employees.add(manager);
        employees.add(employee);

        Manager manager1 = managers.get(0);

        Collection<Employee> employeeCollection = employees;
    }
}
