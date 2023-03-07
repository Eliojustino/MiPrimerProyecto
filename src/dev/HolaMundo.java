package dev;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		System.out.println("Calculador para sacar la media");
		float cal1;
		float cal2;
		float cal3;
		float suma = 0;
		double media;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca la primera calificación: ");
		cal1=leer.nextInt();
		
		System.out.println("La primera calificación es: " + cal1);
		
		System.out.println("Introduzca la segunda calificación: ");
		cal2=leer.nextInt();
		
		System.out.println("La segunda calificación es: " + cal2);
		
		System.out.println("Introduzca la tercera calificación: ");
		cal3=leer.nextInt();
		
		System.out.println("La tercera calificación es: " + cal3);
		
		suma = cal1 + cal2 + cal3;
		media = suma/3;
		System.out.println( "La media aritmetica es: " + media );
	}

}
