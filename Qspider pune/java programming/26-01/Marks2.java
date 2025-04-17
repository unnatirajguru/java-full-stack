import java.util.Scanner;
class Marks2
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter your Marks: ");
 int marks= sc.nextInt();
 float percen= (marks*100)/600;
 String result=(percen >= 75) ? "Grade A" :
                        (percen >= 60) ? "Grade B" :
                        (percen >= 30) ? "Grade C" : "Failed";
 System.out.println(result);
}
}