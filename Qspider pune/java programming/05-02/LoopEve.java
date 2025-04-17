//import java.util.Scanner;
class LoopEve
{
 public static void main(String[]args)
{
 //Scanner sc= new Scanner(System.in);
 System.out.println("****** 1 TO 100 EVEN NUMBERS ******");
 for(int i=0;i<=100;i+=2)
{
 //if(i%2==0)... we can also use this to find even no.(int i=0;i<=100;i++) 
 System.out.print(i+" ");
}

 System.out.println("");
 System.out.println("");

System.out.println("****** 1 TO 100 ODD NUMBERS ******");
 for(int i=99;i>=1;i-=2)
{

 System.out.print(i+" ");
}
}
}