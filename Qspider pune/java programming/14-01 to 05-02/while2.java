import java.util.Scanner;
class while2
{
 public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=0;

System.out.println("     Welcome to the Alphabets   ");
System.out.println();
System.out.println(" Kya Chahiy Tumhe bolo  ");
System.out.println("1. ABCD Uppercase  ");
System.out.println("2. abcd Lowercase ");
System.out.println(" Enter the option");
System.out.println("");
int opt= sc.nextInt();
char alpha=sc.next().charAt(0); 
 while(alpha<='A' || alpha<='Z') 
 {
  System.out.print("Alphabet:"+alpha+" ");
  alpha++;
 }
}
}
