package testEnum;

import enums.Continentes;
import enums.Days;

public class TestEnums {
  public static void main(String[] args) {
	System.out.println("Day: "+Days.Monday);
	
	System.out.println("Continents"+Continentes.ASIA);

	System.out.println("Continents"+Continentes.ASIA.getPaises());
}
}
