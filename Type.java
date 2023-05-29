package cercle;

import java.util.Scanner;

public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type;
		int tarif;
		
		System.out.println("Donner un type: ");
		
		Scanner clavier = new Scanner(System.in);
		type = clavier.nextInt();
		
		switch(type) {
			case 0 : tarif = 10; break;
			case 1 : tarif = 12; break;
			case 2 : tarif = 15; break;
			case 3 : tarif = 25; break;
			default : tarif = 0;
		}
		
		System.out.println("Vous devez payer: " + tarif + " dh");
	}

}
