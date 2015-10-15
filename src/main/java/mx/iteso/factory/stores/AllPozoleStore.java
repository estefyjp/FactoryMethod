package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

public class AllPozoleStore {
	public Pozole createPozole(String typeOfPozole, String meat){
		Pozole pozole = null;
		if(typeOfPozole=="Menudo"){
			PozoleStore Menudo = new MenudoStore();
			pozole = Menudo.orderPozole(meat);
		}
		else if(typeOfPozole=="Rojo"){
			PozoleStore rojo = new PozoleRojoStore();
			pozole = rojo.orderPozole(meat);
		}
		else if(typeOfPozole=="Blanco"){
			PozoleStore blanco = new PozoleBlancoStore();
			pozole = blanco.orderPozole(meat);
		}
		else if(typeOfPozole=="Verde"){
			PozoleStore verde = new PozoleVerdeStore();
			pozole = verde.orderPozole(meat);
		}
		else if(typeOfPozole=="Pozolillo"){
			PozoleStore pozolillo = new PozolilloStore();
			pozole = pozolillo.orderPozole(meat);
		}
		
		return pozole;
	}

	

}
