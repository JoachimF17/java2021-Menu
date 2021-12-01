package be.technifutur.menu;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		//variables
		int input;
		int nbChoix;
		int i;
		//objets
		Scanner sc = new Scanner(System.in);
		Item[] tab = new Item[2];
		MenuFactory mf = new MenuFactory();
		
		//programme
		System.out.println("Menu des fonctions");
		System.out.println("------------------");

		//on passe les getItem() dans le tableau
		tab[0] = mf.getItemHelloWorld();
		tab[1] = mf.getItemFactorielle();

		//pour limiter les boucles
		nbChoix = tab.length;

		//boucle d'affichage du menu (i+1 pour faciliter l'affichage, demarre a 1 au lieu de 0)
		for(i = 0; i < nbChoix; i++)
			System.out.println((i+1)+". "+tab[i].getName());
		
		do //boucle de verification de l'input
		{
			System.out.print("Entrez le nombre correspondant : ");
			input = Integer.parseInt(sc.nextLine());
		}while(input<1 || input>nbChoix);

		//une fois l'indice selectionne on execute le code voulu (i-1 car on affiche i+1 dans le menu)
		tab[input-1].getAction().run();
	}
}