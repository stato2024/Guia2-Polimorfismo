import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (salir != true) {
            System.out.println("--------------Menu-----------------");
            System.out.println("---1.Ingresar un empleado turno completo---");
            System.out.println("---2.Agregar un empleado por hora----");
            System.out.println("---3.Ingreasr un empleado contratado por proyecto----");
            System.out.println("---4.Mostrar sueldos de empleado---");
            System.out.println("---5.Salir---");
            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                case 5:
                    salir = true;
                    break;


            }


        }

    }
}
