import Articulo.Articulo;

import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            int opcion = sc.nextInt();
            System.out.println("Seleccione una opcion: ");
            System.out.println("1: Crear articulo electronico ");
            System.out.println("2. Modificar articulo electronico ");
            System.out.println("3. Consultar articulo electronico");
            System.out.println("4. Salir");
            System.out.print("Opcion > ");
            sc.nextInt();

            switch (opcion){
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    System.out.println("Nombre del artiuclo que desea modificar: ");

                    break;
                case 3:
                    System.out.println("Consulta de articulo electronico: ");
                    break;

            }


        }while (opcion != 4);

    }

    private static void agregarArticulo(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        double precio;

        System.out.println("nombre del articulo que desea agregar: ");
        nombre = sc.nextLine();
        System.out.println("");



    }

}