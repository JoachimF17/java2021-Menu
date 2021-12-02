package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue
{
    private Scanner input = new Scanner(System.in);

    public String saisirMenu(MenuModel menu)
    {
        //variables
        int size = menu.getSize();
        int i;

        //affichage
        System.out.println("Menu des programmes");
        System.out.println("-------------------");

        //boucle qui renvoie le name de chaque item
        for(i = 0; i < size; i++)
            System.out.println((i+1)+". "+menu.getItem(i).getName());

        //on demande l'input a l'utilisateur
        System.out.print("Entrez le nombre correspondant : ");
        //on renvoie l'input, la verif se fera dans le controller et pas dans la vue
        return input.nextLine();
    }
}
