package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class Pozolillo extends Pozole {
	 public Pozolillo() {
	        name = "Pozolillo";
	        broth = "Caldo Rojo";
	        //toppings.add("Oregano");
	        //toppings.add("Col");
	        //toppings.add("Rabanos");
	    }

	    @Override
	    public void serve() {
	        System.out.println("Serving pozolillo..." );
	    }
}
