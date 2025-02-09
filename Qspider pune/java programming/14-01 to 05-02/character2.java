import java.util.Scanner;
class character1;
{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a character");
 char ch=next().charAt(0);
 String op=((ch>='A' && ch<='Z')||(ch>='a'&&ch<=122))?((ch>='a'&&ch<='z')?(ch+ " is a Lowercase"):(ch+ "is a uppercase"));
((ch>='0'&& ch>='9')?(ch+" is a digit"):(ch+" is a special character"));
System.out.println(op);
 }
}