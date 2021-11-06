package aplicacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numeroUsuario;
		int numeroAleatorio;
		int numeroAdivinar;
		int caso = 0;
		String nombre;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Hola, añada su nombre");
			nombre = sc.next();
			System.out.println(nombre + " introzuca un número máximo mayor que 1 ");
			numeroUsuario = sc.nextInt();
			if (numeroUsuario <= 1) {
				System.out.println(nombre + " introduzca un número mayor que 1");
				numeroUsuario = sc.nextInt();
			}

			numeroAleatorio = (int) (Math.random() * numeroUsuario + 1);

			System.out.println(
					nombre + " ahora deberá adivinar el numero generado aleatoriamente entre 1 y " + numeroUsuario);

			System.out.println(nombre + " añade un número entre 1 y " + numeroUsuario);
			numeroAdivinar = sc.nextInt();

			while (numeroAdivinar != numeroAleatorio) {
				switch (caso) {
				case 0:
					System.out.println(nombre + " añada otro número");
					numeroAdivinar = sc.nextInt();
					if (numeroAdivinar < numeroAleatorio) {
						caso = 1;
					}
					if (numeroAdivinar > numeroAleatorio) {
						caso = 2;
					}
					break;
				case 1:
					System.out.println(nombre + " el numero a adivinar es más MAYOR");
					caso = 0;
					break;
				case 2:
					System.out.println(nombre + " el numero a adivinar es más PEQUEÑO");
					caso = 0;
					break;
				}
			}
			System.out.println("Enorabuena " + nombre + " adivaste el número");
			sc.close();
		} catch (Exception e) {
			System.out.println("Añade un NUMERO no una letra");
		}
	}

}
