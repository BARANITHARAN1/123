import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in)
String s1=s.nextLine();
String s2= new StringBuffer(s1).reverse().toString();
System.out.print(s2);
}
}
