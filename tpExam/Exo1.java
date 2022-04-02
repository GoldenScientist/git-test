/**
 * 
 */
package tpExam;

/**
 * @author emako
 * @version 1.0.0 
 * 
 *
 */
public class Exo1 {

	/**
	 * @param args
	 * @param somme : variable ...
	 * 
	 */
	
	// si l'utilisateur saisie autre chose que euros ou dollars l'unité lui sera redemandé
	
	
	// euros  => String1 
	
	// dollars  => Sring2 
	
	
	
	

	public static void main(String[] args) {
		// conversion euros en dollars 


		double somme = 0; 
	
		double montant = 0; 

		String monnaie = ""; 

		java.util.Scanner input = new java.util.Scanner(System.in); 

		do
		{
			System.out.println("Entrer la somme à convertir : ");
			somme = input.nextDouble();

			System.out.println("Entrer la monnaie euros ou dollars : "); 
			monnaie = input.next(); 

			if (monnaie.equals("euros")) {
				montant = somme * 1.10; 

				System.out.println(somme + " euros " + "egale à " + montant + " dollars");

			}
			if(monnaie.equals("dollars")) {
				montant = somme/1.10; 
				System.out.println(somme + " dollars " + "egale à " + montant + " euros");
			}


		}while(!monnaie.equals("euros") && !monnaie.equals("dollars")); 
		
		input.close();
	


	}

}
