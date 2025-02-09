import java.util.Scanner;
class LoopNum
{
 public static void main(String[]args)
{
System.out.println("Enter a number:");

//num is initialized
int num= new Scanner(System.in).nextInt(); //123
int dup= num;
int sum= 0; //3
//30.. true
while(num>0)
{
// 3%10.. 3 rem
 int rem=num%10;
 sum+=rem; //3+1=4
num/=10; //update
}
System.out.println(sum);
System.out.println(dup);
}
}
}