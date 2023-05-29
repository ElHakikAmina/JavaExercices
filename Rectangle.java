package cercle;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double longueur;
		double largueur;
		double perimetre;
		double surface;
		System.out.println("Donner la longueur et largueur: ");
		Scanner clavier = new Scanner (System.in);
		longueur=clavier.nextDouble();
		largueur=clavier.nextDouble();
		perimetre= 2*(longueur+largueur);
		surface =longueur* largueur;
		System.out.println("Le périmetre est: "+perimetre);
		System.out.println("La surface est: "+surface);
	}

}
