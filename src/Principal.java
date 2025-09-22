import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		// Librerias son conjunto de clases desarrollados por alguien mas para que
		// nuestras apliciones funcionen correctamente
		Scanner lectura = null;

		System.out.println("Hola mundo");
		System.out.println("Tienes un 10");

		String marca, so;
		float precio;
		int sotock, menuPrinc, subMenu, indice;

		Computadoras computadora = null;

		List<Computadoras> listaComps = new ArrayList<Computadoras>();

		// Realizar el crud basico
		do {
			System.out.println("Menu principal");
			System.out.println("1---Alta");
			System.out.println("2---Mostrar");
			System.out.println("3---Buscar");
			System.out.println("4--Editar");
			System.out.println("5---Eliminar");
			System.out.println("6---Buscar por marca");
			System.out.println("7---Buscar por so");
			System.out.println("8---Calcular dinero invertido"); // (multiplicar el precio * stock) + sumar
			System.out.println("9---Eliminar buscando por marca");
			System.out.println("10---Salir");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {

					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese el stock");
					lectura = new Scanner(System.in);
					sotock = lectura.nextInt();

					System.out.println("Ingrese el sistema operativo");
					lectura = new Scanner(System.in);
					so = lectura.nextLine();

					// Crear el objeto
					computadora = new Computadoras(marca, precio, sotock, so);

					// Agregar a la lista
					listaComps.add(computadora);
					System.out.println("Se guardo con exito");

				} catch (Exception e) {
					// TODO: handle exception

					System.out.println("Error al guardar " + e.getCause());
				}
				break;
			case 2:
				System.out.println(listaComps);
				break;
			case 3:

				try {
					System.out.println("Ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					computadora = listaComps.get(indice);
					System.out.println("Se encontro el registro " + computadora);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar no existe ese registro");
				}
				break;
			case 4:
				// Para editar primero hay que buscar
				try {
					System.out.println("Ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					computadora = listaComps.get(indice);
					System.out.println("Se encontro la computadora a editar " + computadora.getMarca());

					do {
						System.out.println("Submenu para editar");
						System.out.println("1---Marca");
						System.out.println("2---Precio");
						System.out.println("3---Regresar");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese la nueva  marca");
							lectura = new Scanner(System.in);
							marca = lectura.nextLine();

							// Actualizar
							computadora.setMarca(marca);
							System.out.println("Se edito");
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualizar
							computadora.setPrecio(precio);
							System.out.println("Se edito");
							break;
						case 3:
							break;
						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro para editar");
				}

				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					listaComps.remove(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 6:
				// Algoritmo---como sera la logica desarrollo
				// 1---Pedir la marca
				// 2---Recorrer los registros de la lista---Ciclos
				// 3--Buscar en la lista----Condicional
				// 4---Mensaje cuando no exista el registro --- banderas o robot

				boolean bandera = false;

				System.out.println("Ingrese la marca a buscar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				for (int i = 0; i < listaComps.size(); i++) {
					if (listaComps.get(i).getMarca().equals(marca)) {
						System.out.println(listaComps.get(i));
						bandera = true;
						break; // Detener la iteracion
					}
				}

				if (bandera == false)
					System.out.println("No existe");

				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				boolean bandera2 = false;

				System.out.println("Ingrese la marca a eliminar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				for (int i = 0; i < listaComps.size(); i++) {
					if (listaComps.get(i).getMarca().equals(marca)) {
						listaComps.remove(i);
						bandera = true;
						break; // Detener la iteracion
					}
				}

				if (bandera2 == false)
					System.out.println("No existe para eliminar");
				break;
			case 10:
				break;
			}

		} while (menuPrinc < 10);

	}

}
