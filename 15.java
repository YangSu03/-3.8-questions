import java.util.*;
class Fifteen {
  public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  double income, houseCost, totalChildren, schoolChildren;
  double tax;
  
  System.out.println("Income: ");
  income = sc.nextDouble();
  System.out.println("houseCos: ");
  houseCost = sc.nextDouble();
  System.out.println("totalChildren: ");
  totalChildren = sc.nextDouble();
  System.out.println("schoolChildren: ");
  schoolChildren = sc.nextDouble();

  if (houseCost > 8000)
    tax = income * 0.18;
  else 
    tax = (income - 10000) * 18;
  
  if(houseCost < 6000 && totalChildren > 1 && schoolChildren > 0)
    tax = tax - ((schoolChildren * 1000) + (totalChildren - schoolChildren) * 500) * 0.18;
  
  if (tax > 2000)
    tax *= 1.15;
  else if (tax < 0)
    tax = 0;
  System.out.println(tax);  
  }
}