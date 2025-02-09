import java.util.Scanner;
class Census
{
 public static void main(String[]args)
 {
  int currpop=15678934;
  final long seconds=(365*24*60*60)*5;
  long birth= seconds/7;
  long death= seconds/13;
  long imm= seconds/7;
  long newpop= currpop+birth-death+imm;
  System.out.println("Current population= "+currpop);
  System.out.println("new population= "+newpop);
}
}