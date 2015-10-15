package Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Cebolla extends CondimentsDecorator{
	Pozole pozole;
	public Cebolla(Pozole pozole){
		this.pozole=pozole;
	}
	public String getName(){
		return this.pozole.getName() + ", cebolla";
	}

}
