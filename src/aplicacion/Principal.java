package aplicacion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int numeroUsuario;
        int numeroAleatorio;
        int numeroAdivinar;
        int casos = 0;

	Scanner sc = new Scanner(System.in);
	try{
        	System.out.println("Introzuca un número máximo mayor que 1 ");
        	numeroUsuario = sc.nextInt();
        	if (numeroUsuario <= 1) {
            		System.out.println("Introduzca un número mayor que 1");
            		numeroUsuario = sc.nextInt();
        	}

		numeroAleatorio = (int) (Math.random() * numeroUsuario + 1);

        	System.out.println("Ahora deberá adivinar el numero generado aleatoriamente entre 1 y " 
				+ numeroUsuario);

        	numeroAdivinar = sc.nextInt();
        	for (int i = 0; i <= numeroAleatorio; i++) {
            		if (numeroAdivinar == numeroAleatorio) {
                		System.out.println("¡Enorabuena has adivinado el número!");
           		 } else if (numeroAdivinar < numeroAleatorio) {
                		System.out.println("OHHH no era el número, prube con otro numero más grande");
               		 	numeroAdivinar = sc.nextInt();
           	 	} else if (numeroAdivinar > numeroAleatorio) {
                		System.out.println("OHHH no era el número, prube con otro numero más pequeño");
                		numeroAdivinar = sc.nextInt();
            		}
        	}
        	sc.close();
	}catch(Exception e){
		System.out.println("Añada un NUMERO no una letra");
	}
    }

}
