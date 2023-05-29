package cercle;

import java.util.Scanner;

public class ValeurAbsolu {
	public static void main(String[] args) {
		int absolu;
		int valeur;
		System.out.println("Donner un enteir: ");
		Scanner clavier = new Scanner(System.in);
		valeur= clavier.nextInt();
		if(valeur<0){
			absolu=-valeur;
		}else {
			absolu=valeur;
		}
		System.out.println("La valeur absolu de "+valeur+" est: "+absolu);
	}
}
