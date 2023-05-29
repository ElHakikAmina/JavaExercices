package formationJava;
import java.util.Scanner;
public class Consommation {

	public static void main(String[] args) {
		
		int KilometrageArivee;
		int KilometrageDepart;
		int carburntDepart;
		int carburantArrivee;
		double consommation;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer les valeurs:");
		
		KilometrageArivee = clavier.nextInt();
		KilometrageDepart= clavier.nextInt();
		carburntDepart= clavier.nextInt();
		carburantArrivee= clavier.nextInt();
		
		if(KilometrageArivee == KilometrageDepart){
			System.out.println("Erreur");
		}else{
			consommation = 100*(carburntDepart-KilometrageArivee)/(KilometrageArivee-KilometrageDepart);
			System.out.println("la consommation est "+consommation+"%");
					
		}
		
	}

}
