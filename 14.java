import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Forteen {
  public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int quarters, dimes, nickels, cents;
  int afterquarter, afterdimes, afternickels, aftercents;

  System.out.println("Enter the number of cents you have.");
  cents = sc.nextInt();
  quarters = cents/25;
  afterquarter = cents%25;
  dimes = afterquarter/10;
  afterdimes = afterquarter%10;
  nickels = afterdimes/5;
  afternickels = afterdimes%5;
  aftercents = afternickels;

if (quarters==0&&dimes!=0&&nickels!=0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+dimes+" dimes, "+nickels+" nickels, "+centsLeft+" cents.");
    }
else if (quarters!=0&&dimes==0&&nickels!=0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+nickels+" nickels, "+centsLeft+" cents.");
    }
else if (quarters!=0&&dimes!=0&&nickels==0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+dimes+" dimes, "+centsLeft+" cents.");
   }
else if (quarters!=0&&dimes!=0&&nickels!=0&&centsLeft==0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels.");
  }
else if (quarters==0&&dimes==0&&nickels!=0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+nickels+" nickels, "+centsLeft+" cents.");
  }
else if (quarters!=0&&dimes==0&&nickels==0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+centsLeft+" cents.");
  }
else if (quarters!=0&&dimes!=0&&nickels==0&&centsLeft==0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+dimes+" dimes.");
  }
else if (quarters==0&&dimes!=0&&nickels!=0&&centsLeft==0) {
  System.out.println(cents+" cents: "+dimes+" dimes, "+nickels+" nickels.");
  }
else if (quarters!=0&&dimes==0&&nickels!=0&&centsLeft==0) {
  System.out.println(cents+" cents: "+quarters+" quarters, "+nickels+" nickels.");
  }
else if (quarters==0&&dimes!=0&&nickels==0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+dimes+" dimes, "+centsLeft+" cents.");
  }
else if (quarters!=0&&dimes==0&&nickels==0&&centsLeft==0) {
  System.out.println(cents+" cents: "+quarters+" quarters.");
  }
else if (quarters==0&&dimes!=0&&nickels==0&&centsLeft==0) {
  System.out.println(cents+" cents: "+dimes+" dimes.");
  }
else if (quarters==0&&dimes==0&&nickels!=0&&centsLeft==0) {
  System.out.println(cents+" cents: "+nickels+" nickels.");
  }
else if (quarters==0&&dimes==0&&nickels==0&&centsLeft!=0) {
  System.out.println(cents+" cents: "+centsLeft+" cents.");
  }
else if (quarters==0&&dimes==0&&nickels==0&&centsLeft==0) {
  System.out.println(cents+" cents: N/A.");
  }
else {
  System.out.println(cents+" cents: "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, "+centsLeft+" cents. ");
  }
 }
}