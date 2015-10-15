package Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Rabanos extends CondimentsDecorator  {
	Pozole pozole;
	public Rabanos(Pozole pozole){
		this.pozole=pozole;
	}
	public String getName(){
		return this.pozole.getName() + ", rabanos";
	}
	
}
