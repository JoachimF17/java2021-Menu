package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel
{
    private ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public Item getItem(int i)
    {
        if(itemList.get(i) == null)
            return null;
        else
            return itemList.get(i);
    }

    public int getSize()
    {
        return itemList.size();
    }
}
