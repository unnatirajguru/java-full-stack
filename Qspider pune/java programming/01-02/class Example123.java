import java.util.Scanner;
class Game
{
 public static void main(String[]args)
  Scanner sc= new Scanner(System.in);
  int rNum=0; 
 for ( ; ; )
{
  int num =(int)(Math.random()*10);
  if(num>= && num<=3)
{
 rNum= num;
 break;
}
}
 String codeOpt= null;
if(rNum==1)
{
 codeOpt= "STORE";
}
else if (rNum==2)
{
 codeOpt= "PAPER";
}
else if (rNum==3)
{
codeOpt= "SCISSOR";
}

System.out.println();
System.out.println("     WELOCOME    ");
System.out.println();
System.out.println(" 1.STONE 2.PAPER 3.SCISSOR ");
System.out.println("Enter option: ");
int opt= sc.nextInt();
String userOpt = null;
if(opt==1)
{
 userOpt = "STONE";
 }
else if(opt==2)
{
 userOpt = "PAPER";
 }
else if(opt==3)
{
 userOpt = "SCISSOR";
 }
else
{
 System.out.println("INVALID INPUT");
 return ;
}
 System.out.println("User : "+userOpt+" Bot: "+codeOpt);
if((opt==1 && rNum==3)||(opt==2&&rNum==1)||(opt==3&&rNum==1))
{
 System.out.println("User WINS ");
}
else if((opt==1 && rNum==2)||(opt==2&&rNum==3)||(opt==3&&rNum==1))
{
 System.out.println("BOT WINS ");
}
else 
{
 System.out.println("DRAW ");
}
}



