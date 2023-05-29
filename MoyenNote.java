package cercle;

import java.util.Scanner;

public class MoyenNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double moyenne;
		
		Scanner clavier = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Donner la note " + i + ":");
			total += clavier.nextDouble();
		}
		moyenne = total / 10;
		System.out.println("La moyenne est : " + moyenne);
	}

}
