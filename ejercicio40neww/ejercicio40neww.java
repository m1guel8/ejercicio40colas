package ejercicio40neww;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ejercicio40neww {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a = true;
		int opcion = 0;
		Queue<String> cola = new LinkedList<>();
		do {
			do {
				System.out.println("Ingrese la Opcion que desea realizar : ");
				System.out.println("1. Agregar una persona a la cola (ingresa el nombre).");
				System.out.println("2. Atender a la primera persona (eliminar de la cola).");
				System.out.println("3. Ver quién es el próximo.");
				System.out.println("4. Mostrar la cola completa.");
				System.out.println("5. Salir.");
				opcion = scanner.nextInt();
				if (opcion < 0 || opcion > 5) {
					System.out.println("Opcion fuera de rango, Ingrese nuevamente");
				}
				switch (opcion) {

				case 1:
					System.out.println("Ingrese el valor que va ingresar : ");
					String ingreso = scanner.next();
					cola.add(ingreso);
					break;
				case 2:
					String valorEliminado = cola.poll();
					System.out.println("El valor que fue eliminado fue : " + valorEliminado);
					break;
				case 3:
					System.out.println("El proximo en la cola es : " + cola.peek());
					break;
				case 4:
					System.out.println(cola);
					break;
				case 5:
					a = false;
					break;
				default : System.out.println("Usted Ingreso una opcion incorrecta");
				}
				
			}

			while (opcion < 0 || opcion > 5);
		}

		while (a);

	}
}
