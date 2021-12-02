package be.technifutur.menu;

public class MenuController
{
    MenuModel model = new MenuModel();
    MenuVue vue = new MenuVue();

    //setters
    public void setModel(MenuModel model)
    {
        this.model = model;
    }

    public void setVue(MenuVue vue)
    {
        this.vue = vue;
    }
    //fin setters

    public Runnable getAction()
    {
        Runnable temp;
        String tempString;
        int tempInt;
        boolean trouve = false;

        tempString = vue.saisirMenu(this.model);

        tempInt = Integer.parseInt(tempString) - 1; //-1 car affichage a partir de 1 et pas 0

        temp = this.model.getItem(tempInt).getAction();

        if(temp != null)
            return temp;
        else
            return null;
    }
}
