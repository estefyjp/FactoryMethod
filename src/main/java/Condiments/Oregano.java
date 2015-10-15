package Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Oregano extends CondimentsDecorator  {
	Pozole pozole;
	public Oregano(Pozole pozole){
		this.pozole=pozole;
	}
	public String getName(){
		return this.pozole.getName() + ", oregano";
	}
	
}
