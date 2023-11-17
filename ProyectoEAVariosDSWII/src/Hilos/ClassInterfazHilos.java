package Hilos;

public class ClassInterfazHilos implements Runnable {

	@Override
	public void run() {
		//suma de los 10 primeros numeros........
		//acumulador
		int sumapares=0;
		//aplicamos un bucle for...
		for(int z=1;z<=10;z++){
			//aplicamos una condicion..
			if(z%2==0){
				 //realizamos una impresion  por pantalla
				System.out.println("Pares: "+z);
				sumapares=sumapares+z;
			}  //fin del if...
			
		}  //fin del bucle for...
		
		//emitimos la respuesta en consola
		System.out.println("suma de pares "+sumapares);
		
	}  //fin del metodo run....

}  //fin de la clase...
