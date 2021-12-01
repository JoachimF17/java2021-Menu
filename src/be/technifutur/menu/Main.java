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
		//objets
		Scanner sc = new Scanner(System.in);
		Helloworld hw = new Helloworld();
		Factorielle facto = new Factorielle();
		Runnable[] tab = {hw, facto};
		
		//programme
		System.out.println("Menu des fonctions");
		System.out.println("------------------");
		System.out.println("1. Afficher Hello World");
		System.out.println("2. Calcul factorielle");
		
		nbChoix = tab.length;
		
		do //boucle de verification
		{
			System.out.print("Entrez le nombre correspondant : ");
			input = Integer.parseInt(sc.nextLine());
		}while(input<1 || input>nbChoix);
		
		tab[input-1].run();
	}
}