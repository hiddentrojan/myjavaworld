/*Single Inheritance
 * Single Inheritance: In single inheritance, subclasses inherit the features of one superclass.
 */

import java.util.*;

class record
{
    public
    record()
    {
        System.out.println("No record was found in Base Class");
    }
}

class showrecord extends record
{
    public
    showrecord()
    {
        System.out.println("No record was there in Base Class");
    }
}

public class SI
{
    public static void main(String [] args)
    {
        showrecord obj = new showrecord();
    }
}