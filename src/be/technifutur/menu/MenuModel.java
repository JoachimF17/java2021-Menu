package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel
{
    private ArrayList<MenuNode> menuNodeList = new ArrayList<>();
    private String name;

    //constructeur
    MenuModel(String name)
    {
        this.name = name;
    }

    public void addNode(MenuNode menuNode)
    {
        if(menuNode != null)
            this.menuNodeList.add(menuNode); //ajoute le node passe en params
    }

    public MenuNode getNode(int i)
    {
        if(i >= getSize() || i < 0)
            return null; //retourne null si l'indice ne renvoie pas une valeur comprise dans les limites de la liste
        else
            return this.menuNodeList.get(i); //sinon renvoie le node
    }

    public int getSize() //on revoie la taille de la liste
    {
        return this.menuNodeList.size();
    }

    public String getName()
    {
        return this.name;
    }
}
