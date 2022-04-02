/**
 * 
 */
package tpExam;

import java.util.ArrayList;

/**
 * @author Yacine FOSSO
 *
 */
public class Exo4 {

	public static java.util.Random generator = new java.util.Random(); 

	public static java.util.Scanner input = new java.util.Scanner(System.in); 

	public static void RemplirTab(int tab[])
	{
		for (int i = 0; i< tab.length; i++)
		{
			tab[i] = generator.nextInt(100); 
		}
	}
	
	public static void afficheTab(int tab[])
	{
		System.out.print ("[");
		for (int i = 0; i< tab.length; i++)
		{
			 
			System.out.print(tab[i] + ","); 
		}
		System.out.println ("]");
		
		
		 
		
	}
	public static void choixaleatoire(int tab[])
	{
		ArrayList<Integer> tabValeurInf = new java.util.ArrayList<Integer>(); 
		ArrayList<Integer> tabValeurSup = new java.util.ArrayList<Integer>();
		
		ArrayList<Integer> tabValeurSupfinal = new java.util.ArrayList<Integer>();
		ArrayList<Integer> tabValeurInffinal = new java.util.ArrayList<Integer>();
		
		int aleatoire = generator.nextInt(tab.length); 
		
		for (int i = 0; i< tab.length; i++)
		{
			if(tab[i] < aleatoire )
			{
				tabValeurInf.add(tab[i]);
			}
			else if (tab[i] > aleatoire)
			{
				tabValeurSup.add(tab[i]);  
			}
		}
		
	
		
		for (int i = 0; i<tabValeurSup.size(); i++)
		{
			if(tabValeurSup.get(i) > aleatoire)
			{
				tabValeurSupfinal.add(tabValeurSup.get(i)); 
			}
			
		}
		
		for(int i = 0; i< tabValeurInf.size(); i++)
		{
			if (tabValeurInf.get(i) < aleatoire)
			{
				tabValeurInffinal.add(tabValeurInf.get(i)); 
			}
		}
		
		
		System.out.print("valeur aleatoire : " + aleatoire);
		System.out.println(); 
		System.out.println("Sequence Valeur supérieur");
		System.out.print(tabValeurSup);
		System.out.println(","); 
		System.out.println(); 
		System.out.println("Sequences valeur inferieur");
		System.out.print(tabValeurInf);
	


	}
	
	
	public static void main(String[] args) {
		
		int[] tab = new int[20];
		RemplirTab(tab); 
		afficheTab(tab);
		System.out.println("Choix aleatoire"); 
		choixaleatoire(tab);
		
		
		
		
		


	}

}
