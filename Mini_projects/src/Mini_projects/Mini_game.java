package Mini_projects;
import java.util.Random;
import java.util.Scanner;

public class Mini_game {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	String rps[]= {"r","s","p"};
//	for choosing random this line was used
	String ComputerMove= rps[new Random().nextInt(rps.length)];
	String Playermove;
	
	while(true) {
		System.out.println("plzz enter your move (r,p or s)");
		Playermove=sc.nextLine();
		if(Playermove.equals("r")||Playermove.equals("s")||Playermove.equals("p")) {
		break;	
		}
		System.out.println(Playermove+" it is not a valid move :) ");
		}
	System.out.println("computer played: "+ComputerMove);
	
	if(Playermove.equals(ComputerMove)) {
		System.out.println("it is a tie");
	}
	else if(Playermove.equals("r")) {
		if(ComputerMove.equals("p")) {
			System.out.println("you lose!");
		}
			else if(ComputerMove.equals("s")) {
				System.out.println("you win!");				
			}
		}
	else if(Playermove.equals("s")) {
		if(ComputerMove.equals("r")) {
			System.out.println("you lose!");
		}
			else if(ComputerMove.equals("p")) {
				System.out.println("you win!");				
			}
		}
	else if(Playermove.equals("p")) {
		if(ComputerMove.equals("s")) {
			System.out.println("you lose!");
		}
			else if(ComputerMove.equals("r")) {
				System.out.println("you win!");				
			}
		}
	System.out.println("do u wanna play again(y/n)");
	String PlayAgain=sc.nextLine();
	if(!PlayAgain.equals("y")) {
		break;
	}
	
		}
	System.out.println("Game is end!");
	sc.close();
	
		}
}	

