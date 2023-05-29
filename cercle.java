package cercle;

import java.util.Scanner;

public class cercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=Math.PI;
		double p;
		double r;
		System.out.println("Donner le rayon: ");
		Scanner clavier = new Scanner(System.in);
		r=clavier.nextDouble();
		p=2*PI*r;
		System.out.println("Le périmétre est : "+p);
	}
}
