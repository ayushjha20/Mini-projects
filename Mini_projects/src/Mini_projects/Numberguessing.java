package Mini_projects;

import java.util.Random;
import java.util.Scanner;

public class Numberguessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
	   String number[]= {"1","2","3"};
	   String computermove=number[new Random().nextInt(number.length)];
	   String usermove;
	   
	   while(true) {
		   System.out.println("guess the correct number between 1 to 3");
		   usermove=sc.nextLine();
		   if(usermove.equals("1")||usermove.equals("2")||usermove.equals("3")) {
			   break;
		   }
		   System.out.println("enter the vaid answer!");
	   }
	   
	   System.out.println("computer played: "+computermove);
	   
	   if(usermove.equals(computermove)) {
		   System.out.println("you win");
	   }
	   else if(usermove.equals("1")) {
		   if(computermove.equals("2")) {
			   System.out.println("u lose!");
		   }else if(computermove.equals("3")) {
			   System.out.println("u lose!");
		   }
	   }
	   else if(usermove.equals("2")) {
		   if(computermove.equals("1")) {
			   System.out.println("u lose!");
		   }else if(computermove.equals("3")) {
			   System.out.println("u lose!");
		   }
	   }
	   else if(usermove.equals("3")) {
		   if(computermove.equals("1")) {
			   System.out.println("u lose!");
		   }else if(computermove.equals("2")) {
			   System.out.println("u lose!");
		   }
	   }
	   System.out.println("do u want to play again(y/n)");
	   String playAgain=sc.nextLine();
	   if(!playAgain.equals("y")) {
		   break;
	   }
	    }
		sc.close();
		System.out.println("game is end now!");
	   }

}
