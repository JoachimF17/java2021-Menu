package be.technifutur.menu.actions;

import java.util.Scanner;

public class Input
{
	public int run(int nbChoix)
	{
		//variables
		float input;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		
		do //boucle de verification
		{
			System.out.print("Entrez le nombre correspondant : ");
			input = sc.nextFloat();
		}while(input<1 || input>nbChoix || input%1 != 0);
		
		return (int) input;
	}
}