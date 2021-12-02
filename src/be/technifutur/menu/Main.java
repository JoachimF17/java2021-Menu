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
		MenuFactory factory = new MenuFactory();
		Item[] tab = new Item[3];
		
		//programme
		System.out.println("Menu des programmes");
		System.out.println("-------------------");

		//on passe les getItem() dans le tableau
		tab[0] = factory.getItemHelloWorld();
		tab[1] = factory.getItemFactorielle();
		tab[2] = factory.getItemMoyenne();

		//pour limiter les boucles
		nbChoix = tab.length;

		//boucle d'affichage du menu (i+1 pour faciliter l'affichage, demarre a 1 au lieu de 0)
		for(i = 0; i < nbChoix; i++)
			System.out.println((i+1)+". "+tab[i].getName());
		
		do //boucle de verification de l'input
		{
			System.out.print("Entrez le nombre correspondant : ");
			input = Integer.parseInt(sc.nextLine());
		}while(input < 1 || input > nbChoix);

		//une fois l'indice selectionne on execute le code voulu (i-1 car on affiche i+1 dans le menu)
		tab[input-1].getAction().run();
	}
}