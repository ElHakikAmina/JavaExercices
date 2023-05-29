package exercicesCorriger;

import java.util.Scanner;

public class avg3num {

	public static void main(String[] args) {
		int a;
		int c;
		int b;
		float m;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		m = (a+b+c)/3;
		System.out.println(m);
	}

}
