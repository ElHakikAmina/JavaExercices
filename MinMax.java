package cercle;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valeur1;
		int valeur2;
		int max;
		int min;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner la valeur 1: ");
		valeur1=clavier.nextInt();
		System.out.println("Donner la valeur 2: ");
		valeur2=clavier.nextInt();
		max=min=valeur1;
		if(valeur1<valeur2) {
			max=valeur2;
			min=valeur1;
			System.out.println("Le max est: "+max+ " Le min est: "+min);
		}else if(valeur1>valeur2) {
			max=valeur1;
			min=valeur2;
			System.out.println("Le max est: "+max+ " Le min est: "+min);
		}else {
			System.out.println(max+ " et "+min+" sont egaux");
		}
		
	}

}
