import java.util.Scanner;
class Marks
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter your Marks: ");
 int marks= sc.nextInt();
 float per= ((marks*100)/600);
 String result=(per>=35)?("Pass"):("Fail");
 System.out.println(result);
}
}