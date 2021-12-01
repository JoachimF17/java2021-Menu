package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Factorielle;

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
		Helloworld hw = new Helloworld();
		Factorielle facto = new Factorielle();
		Item[] tab = new Item[2];
		MenuFactory mf = new MenuFactory();
		
		//programme
		System.out.println("Menu des fonctions");
		System.out.println("------------------");

		tab[0] = mf.getItemHelloWorld();
		tab[1] = mf.getItemFactorielle();
		
		nbChoix = tab.length;

		for(i = 0; i < nbChoix; i++)
			System.out.println((i+1)+". "+tab[i].getName());
		
		do //boucle de verification
		{
			System.out.print("Entrez le nombre correspondant : ");
			input = Integer.parseInt(sc.nextLine());
		}while(input<1 || input>nbChoix);
		
		tab[input-1].getAction().run();
	}
}