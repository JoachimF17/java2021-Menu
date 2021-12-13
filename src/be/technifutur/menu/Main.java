package be.technifutur.menu;

public class Main
{
	public static void main(String[] args)
	{
		//objets
		MenuFactory factory = new MenuFactory();
		MenuController control = factory.getMenu();
		Runnable action;
		
		//programme
		action = control.getAction(); //on affecte le runnable

		if (action != null) //on lance le run() que si on n'a pas recu 'null'
			action.run();
		else
			System.out.println("Au revoir !");
	}
}