import java.util.Scanner;
class numchar
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a number");
 int n= sc.nextInt();
 String op=(n%2==0)?((n%2==0 && n%5==0)?("HiiTwoHiiFive"):("HiiTwo")):
 ((n%5==0)?("HiiFive"):("-"));
System.out.println(op);

}
}