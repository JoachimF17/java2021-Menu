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
        //variables
        int tempInt;
        //objets
        Item item;

        //on recupere l'input et on passe de string a int pour passer dans les indices du listItem
        tempInt = Integer.parseInt(vue.saisirMenu(this.model)) - 1; //-1 car affichage a partir de 1 et pas 0

        item = this.model.getItem(tempInt);

        //si l'utilisateur rentre un input invalide, la fonction getItem() renvoie 'null' par protecion
        if(item != null) //si l'input renvoie un item non 'null', on renvoie son runnable
            return item.getAction();
        else //sinon on renvoie null par protection
            return null;
    }
}
