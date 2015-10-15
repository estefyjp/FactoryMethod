package Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Col extends CondimentsDecorator {
	Pozole pozole;
	public Col(Pozole pozole){
		this.pozole=pozole;
	}
	public String getName(){
		return this.pozole.getName() + ", col";
	}
	
}
