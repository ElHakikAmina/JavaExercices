package cercle;

import java.util.Scanner;

public class InstructionIterative {
	public static void main(String[] args) {
		int entier;
		int count = 0;
		int somme = 0;
		Scanner clavier = new Scanner(System.in); 
		//
		System.out.println("Donner un entier [0:Sortir] : ");
		entier = clavier.nextInt();
		somme += entier;
		count++;
		//
		while(entier != 0)
		{
			System.out.println("Donner un entier [0:Sortir] : ");
			entier = clavier.nextInt();
			somme+= entier;
			count++;
		}
		System.out.println("la somme est : " + somme);
		System.out.println("Vous avez entrer " + (count-1) + " entier");
	}
}
