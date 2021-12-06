package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel
{
    private ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item)
    {
        if(item != null)
            this.itemList.add(item); //ajoute l'item passe en params
    }

    public Item getItem(int i)
    {
        if(i >= getSize() || i < 0)
            return null; //retourne null si l'indice ne renvoie pas une valeur comprise dans les limites de la liste
        else
            return this.itemList.get(i); //sinon renvoie l'item
    }

    public int getSize() //on revoie la taille de l'itemList
    {
        return this.itemList.size();
    }
}
