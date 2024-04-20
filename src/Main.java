import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Articulo>;
        Scanner sc = new Scanner();

        do{
            int opcion;
            System.out.println("Seleccione una opcion: ");
            System.out.println("1: Crear articulo electronico ");
            System.out.println("2. Modificar articulo electronico ");
            System.out.println("3. Consultar articulo electronico");
            System.out.println("4. Salir");
            System.out.print("Opcion > ");
            sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escriba: ");

                    System.out.println("nombre del articulo: ");
                    System.out.println("Modelo: ");
                    System.out.println("Descripcion: ");
                    System.out.println("precio: ");
                    break;
                case 2:
                    System.out.println("Nombre del artiuclo que desea modificar: ");

            }


        }while (opcion != 4);

    }
}