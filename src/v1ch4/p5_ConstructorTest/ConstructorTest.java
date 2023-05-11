package v1ch4.p5_ConstructorTest;

import java.util.*;

/**
 * This program demonstrates object construction
 * @version 1.0 2023-4-14
 * @author Zhiliang Su
 */

public class ConstructorTest
{
    public static void main (String[] args)
    {
        // fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
    }
}

class Employee
{
    private static int nextId;

    private int id;
    private String name = ""; //6.instance field initialization
    private double salary;
    private static Random generator = new Random();

    // 5.static initialization block
    static
    {
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // 4.object initialization block
    {
        id = nextId;
        nextId++;
    }

    // 1.three overloaded constructors
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        // 2.calls the Employee(Sting, double) constructor;
        this("Employee #" + nextId, s);
    }

    // 3.the default constructor
    public Employee()
    {
        // name initialized to "" -- see above
        // salary not explicitly set -- initialized to 0
        // id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }
}
