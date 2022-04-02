/**
 * 
 */
package tpExam;

/**
 * @author emako
 *
 */
public class Exo3 {

	/**
	 * @param args
	 * 
	 */

	public static int cptPointEquipe1;
	public static int cptPointEquipe2;
	public static int numeroTrou;
	public static int nbCoupsEquipe1;
	public static int nbCoupsEquipe2;
	public static int numeroTrouEquipe1;
	public static int numeroTrouEquipe2;
	
	public static java.util.Scanner input = new java.util.Scanner(System.in);

	static void initialisePartie() {
		cptPointEquipe1 = 0;
		cptPointEquipe2 = 0;
		numeroTrou = 1; 
		nbCoupsEquipe1 = 0;
		nbCoupsEquipe2 = 0;
		numeroTrouEquipe1 = 0; 
		numeroTrouEquipe2 = 0;
	}

	static void saisie() {

		System.out.println("numero de trou : " + numeroTrou);
		System.out.println("Equipe1 quel est votre score? ");
		nbCoupsEquipe1 = input.nextInt();
		System.out.println("Equipe2 quel est votre score? ");
		nbCoupsEquipe2 = input.nextInt();
		



	}


	static int gagneTrou() {
		if (nbCoupsEquipe1 == nbCoupsEquipe2 ) {
			return 0;
		} else if (nbCoupsEquipe1 < nbCoupsEquipe2) {
			System.out.println("Equipe1");
			return 1;
		} else if (nbCoupsEquipe2 < nbCoupsEquipe1) {
			System.out.println("Equipe2");
			return 2;
		}

		return -1;
	}

	static void majScore(int numEquipe) {



		if(nbCoupsEquipe1 == 1 || numEquipe == 1 )
		{
			cptPointEquipe1 += 1; 
			numeroTrouEquipe1 += 1;
			numeroTrou += 1;
		} 
		if(nbCoupsEquipe2 == 2 || numEquipe == 2)
		{
			cptPointEquipe2 += 1; 
			numeroTrouEquipe2 += 1;
			numeroTrou += 1;
		} 


		


	}
	
	static boolean testFin()
	{
		if(numeroTrou <= 18)
		{
			return true;
		}
		if(java.lang.Math.abs(nbCoupsEquipe1 - nbCoupsEquipe2) > numeroTrou) {
			return true; 
		}
		return false;
	}


	static void resultat()
	{
		System.out.println("Resultat de la Partie de Golf");
		System.out.println("Nombre de points Equipe1 : " +  cptPointEquipe1 );
		System.out.println("Nombre de points Equipe2 : " + cptPointEquipe2);

	}


	public static void main(String[] args) {
		

		System.out.println("bienvenue au jeu de Golf");
		initialisePartie();
		
		do {
		
			saisie(); 
			majScore(gagneTrou());  
			resultat();
			
		}while(testFin());
	 

	}

}
