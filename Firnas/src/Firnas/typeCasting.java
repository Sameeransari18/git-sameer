package Firnas;

import java.awt.Window.Type;

public class typeCasting {
	public static void main(String[] args) {
		int i = 10;
		Integer ii = i; //auto boxing
		
		i = ii;	//auto unboxing 
		
		//Type casting also has manual type casting
		
		System.out.println(ii);
	}
}
