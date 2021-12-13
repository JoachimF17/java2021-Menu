package be.technifutur.menu;

public class MenuController implements MenuNode
{
    //attributs
    MenuModel model;
    MenuVue vue;

    //methodes
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

    //getters MenuNode
    @Override
    public String getName()
    {
        return model.getName();
    }

    @Override public Runnable getAction()
    {
        //variables
        boolean inputInvalide = true;
        int tempInt = 0;
        //objets
        MenuNode menuNode;

        while(inputInvalide)
        {
            try
            {
                //on recupere l'input et on passe de string a int pour passer dans les indices du listItem
                tempInt = Integer.parseInt(this.vue.saisirMenu(this.model)) - 1; //-1 car affichage a partir de 1 et pas 0

                if(tempInt >= 0 && tempInt < model.getSize())
                    inputInvalide = false;
                else
                    this.vue.setError("Nombre invalide");
            }catch(NumberFormatException e)
            {
                this.vue.setError("Input invalide, entrez bien un nombre");
            }
        }

        menuNode = this.model.getNode(tempInt);

        this.vue.setError(null);

        //si l'utilisateur rentre un input invalide, la fonction getItem() renvoie 'null' par protecion
        if(menuNode != null) //si l'input renvoie un item non 'null', on renvoie son runnableh
            return menuNode.getAction();
        else //sinon on renvoie null par protection
            return null;
    }
    //fin getters
}
