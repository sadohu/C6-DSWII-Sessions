package Hilos;

public class ClassSinHilos {

	public static void main(String[] args) {
		//********suma de los 10 primeros numeros naturales
		
		//acumulador
		int sumapares=0;
		//aplicamos un bucle for...
		for(int x=1;x<=10;x++){
			//aplicamos una condicion...
			if(x%2==0){
				//emitimos mensaje por consola...
				System.out.println(" pares "+x);
				sumapares=sumapares+x;
				
			}  //fin del if..
		}  //fin del bucle for...
		
		
		//imprimimos la respuesta por pantalla
		System.out.println("la suma de los 10 primeros numeros pares es "+sumapares);

		//***********suma de los 10	primeros numeros naturales impares
		//acumulador
		int sumaimpares=0;
		//aplicamos un bucle for...
		for(int y=1;y<=10;y++){
			
			//aplicamos una condicion...
			if(y%2!=0){
				//imprimimos un mensaje por pantalla
				System.out.println("impares "+y);
				sumaimpares=sumaimpares+y;
			} //fin de la condicion...
		}  //fin del bucle for..
		
		//imprimimos la respuesta por pantalla
		System.out.println("la suma  de los 10 primeros numeros impares es "+sumaimpares);
		
	}   //fin del metodo principal...

}   //fin de la clase sin hilos
