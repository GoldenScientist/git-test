/**
 * 
 */
package tpExam;

/**
 * @author Yacine FOSSO
 *
 */
public class Exo2 {

	/**
	 * @param args
	 * 
	 */


	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in); 
		java.util.List<Integer> Listnotes = new java.util.ArrayList<>();
		int  compteur = 0;
		int note= 0; 
		int objectif = 0; 

		do
		{
			System.out.print("entrer les valeurs : ");
			note  = input.nextInt(); 
			Listnotes.add(note); 

		}while (note >= 0  && note<= 20); 
		
		
		System.out.println("Saisie l'objectif valeur entre 0 et 20");
		objectif = input.nextInt(); 


		for (int i = 0; i < Listnotes.size(); i++)
		{
			
			if (Listnotes.get(i) >= objectif)
			{
				compteur  = compteur + 1; 
			}

		}
		System.out.println(" le nombre de notes supérieur à " + objectif + " egale à " + compteur);

	}

}
