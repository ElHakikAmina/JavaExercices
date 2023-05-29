package cercle;

import java.util.Scanner;

public class AffichageMention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double note;
		System.out.println("Donner la note");
		Scanner clavier = new Scanner(System.in);
		note=clavier.nextDouble();
		if(note>14) {
			System.out.println("admi avec mention");
		}else if(note>12){
			System.out.println("admi");
		}else if(note>10) {
			System.out.println("ajourné");
		}else {
			System.out.println("exclu");
		}
	}
}
