package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue
{
    private Scanner input = new Scanner(System.in);

    public String saisirMenu(MenuModel menu)
    {
        int size = menu.getSize();
        int i;
        String temp = new String();

        for(i = 0; i < size; i++)
            System.out.println((i+1)+". "+menu.getItem(i).getName());

        System.out.print("Entrez le nombre correspondant : ");
        temp = input.nextLine();

        return temp;
    }
}
