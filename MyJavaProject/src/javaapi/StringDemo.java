package javaapi;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.ZoneId;
import java.util.Date;

public class StringDemo {

    static String myFirstName = "Mozammel";
    static String myLastName = "Sarkar";
    String fullName = "Sohel Rana";
    String lastName = fullName.substring(5,10);
    String firstName = fullName.substring(0,5);

    static String name = myFirstName.concat(" H ") + myLastName.toUpperCase();
    public static void main(String[] args) {
        System.out.println("The first letter of my first name is: " + myFirstName.charAt(0));
        System.out.println("The last letter of my last name is: " + myLastName.charAt(5));
        System.out.println("My First Name (in Capital): " + myFirstName.toUpperCase());
        System.out.println("My Last name (in small): " + myLastName.toLowerCase());
        System.out.println("My first name with middle initial: " + myFirstName.concat(" H"));
        System.out.println("My Full name: " + name);
        System.out.println(myFirstName.substring(1,6));
        System.out.println(myFirstName.length());
        int len = myLastName.length();
        System.out.println(len);
        StringDemo obj = new StringDemo();
        System.out.println("Extracting first name from a full name is: " + obj.firstName);
        System.out.println("Extracting last name from a full name is: " + obj.lastName);




        System.out.println(Clock.systemDefaultZone());
        System.out.println(Clock.systemUTC());

        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm");

        Date date = new Date();
        System.out.println(dateFormat.format(date));

    }

}