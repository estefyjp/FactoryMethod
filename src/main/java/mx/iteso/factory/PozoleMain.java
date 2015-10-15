package mx.iteso.factory;

import Condiments.Cebolla;
import Condiments.Col;
import mx.iteso.factory.stores.AllPozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        pozole =  new Cebolla(pozole);
        pozole =  new Col(pozole);

        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());
        
        /*AllPozoleStore store = new AllPozoleStore();
        Pozole pozole2 = store.createPozole("verde","trompa");
        pozole2 = new Cebolla(pozole2);
        System.out.print(pozole2.getName());*/



    }


}