package v1ch4.p7_PackageTest;

import v1ch4.p7_PackageTest.com.horstmann.corejava.*;

import static java.lang.System.out;

/**
 * This program demonstrate the use of package.
 * @version 1.0 2023-4-17
 * @author Zhiliang Su
 */
public class PackageTest
{
    public static void main(String[] args)
    {
        // because of the import statement, we don't have to use
        // com.horstmann.corejava.Employee here
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
