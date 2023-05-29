package cercle;

import java.util.Scanner;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] entiers = { 1, 2, 3, 4, 1 };
		int x,existe = 0,count = 0,c = -1;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner un entier à chercher: ");
		x = clavier.nextInt();
		
		for(int i = 0; i < entiers.length; i++) {
			if(entiers[i] == x) {
				existe = 1;
				if(c == -1) c = i;
				count++;
			}
		}
		
		if(existe == 1) {
			System.out.println( x+" existe dans la position "+c);
			System.out.println(x+"existe "+count+" fois");
		}
		if(existe == 0) System.out.println(x+" n'existe pas");
	}
}
