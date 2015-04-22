package com.hillel.Inheritance;

import java.util.ArrayList;

/**
 * Created by A.Nikitiuk on 22.04.2015.
 */
public class InheritanceMain {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10,5);

        Colored c = circle;

        ArrayList<Colored> list = new ArrayList<Colored>();
        list.add(circle);
        list.add(rectangle);

    }

    public static void polymorphism() {
        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10,5);

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(circle);
        list.add(rectangle);

        print(list);
    }

    private static void print(ArrayList<Shape> list) {
        for(Shape shape : list){
            System.out.println(shape.toString());
        }
    }

    private static void printAreas(ArrayList<Shape> list) {
        for(Shape shape : list){
            System.out.println("area is " + shape.getArea());
        }
    }

    public static void overloadMethods() {
        Person person = new Employee("Ivan", "IT");

        register(person);
        //register(new Employee("Ivan","it"));
        //register(new Person("Petro"));
    }

    public static void generics() {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Employee("ivan", "IT"));
        list.add(new Person("Andrey"));

        Employee employee = (Employee) list.get(0);
    }

    public static void inconvinienWay() {
        Employee employee = new Employee("Ivan", "dsf");
        Person employeeAsPerson = employee;
        Object employeeAsObject = employeeAsPerson;

        register(employee);
        register(employeeAsPerson);

        ArrayList array = new ArrayList();//спросить
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0);
        employeeAsPerson = (Person) array.get(1);
        employeeAsObject = array.get(2);

        if (employeeAsPerson instanceof Employee){
            employee = (Employee) employeeAsPerson;
        }
        if(employee instanceof Person){
            System.out.println("realy?");
        }
    }

    public static void register(Employee employee){
        System.out.println("employee registered " + employee.getName());
    }

    public static void register(Person person){
        System.out.println("person registered " + person.getName());
    }

    public static void constructors() {
        //Person person = new Person("Ivan");

        Employee employee = new Employee("Petro", "IT");
        // employee = new Employee("vasya");
    }

    public static void simpleExample() {
        /*Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setName("Petro");
        employee.setDepartment("IT");*/

    }
}
