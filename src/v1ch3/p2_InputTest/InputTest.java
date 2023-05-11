package v1ch3.p2_InputTest;

import java.util.*;
public class InputTest
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What's your name?");
        String name = in.nextLine();

        // get second output
        System.out.print("How old are you?");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

//        Console cons = System.console();
//        String userName = cons.readLine("User Name: ");
//        char[] passwd = cons.readPassword("Password: ");
//
//        System.out.println("User Name: " + userName);
//        System.out.println("Password: " + Arrays.toString(passwd));
    }
}
