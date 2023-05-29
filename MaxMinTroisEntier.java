package cercle;

public class MaxMinTroisEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		int c=7;
		int max;
		int min;
		
		if(a>b && a>c) max=a;
		if(b>a && b>c) max=b;
		if(c>b && c>a) max=c;
		
		if(a<b && a<c) min=a;
		if(b<a && b<c) min=b;
		if(c<b && c<a) min=c;
		System.out.println("le max= "+max+" Le min = "+min);

	}

}
