import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {

        Persona show = new Persona();
        byte op1 = 4;
        String op2 = "n";

        show.ingreso();
        System.out.println("Se muestra lista de persona ");
        show.mostrar();

        System.out.print("Desea ordenar alfabeticamente s/n ? ");
        op2 = sc.nextLine();

        do {
            System.out.println("1. Ordenado por nombre.");
            System.out.println("2. Ordenado por apellido.");
            System.out.println("3. ordenado inversamente por apellido.");
            System.out.println("4. Exit.");
            op1 = Byte.parseByte(sc.nextLine());
        }
        while (op1==4);

        if (op1!=4) {
            switch (op1) {
                case 1:
                    ArrayList<Persona> listaOrdenadaNombre = Persona.sortPersona(show.listaPersonas, "nombre");
                    System.out.println(listaOrdenadaNombre.get(0).getNombre() + "\n" +
                            listaOrdenadaNombre.get(1).getNombre() + "\n" +
                            listaOrdenadaNombre.get(2).getNombre() + "\n" +
                            listaOrdenadaNombre.get(3).getNombre() + "\n" +
                            listaOrdenadaNombre.get(4).getNombre() + "\n");
                    break;
                case 2:
                    ArrayList<Persona> listaOrdenadaApellido = Persona.sortPersona(show.listaPersonas, "apellido");
                    System.out.println(listaOrdenadaApellido.get(0).getApellido() + "\n" +
                            listaOrdenadaApellido.get(1).getApellido() + "\n" +
                            listaOrdenadaApellido.get(2).getApellido() + "\n" +
                            listaOrdenadaApellido.get(3).getApellido() + "\n" +
                            listaOrdenadaApellido.get(4).getApellido() + "\n");
                    break;
                case 3:
                    ArrayList<Persona> listaOrdenadaApellidoInv = Persona.sortPersona(show.listaPersonas, "apellido2");
                    System.out.println(listaOrdenadaApellidoInv.get(0).getApellido() + "\n" +
                            listaOrdenadaApellidoInv.get(1).getApellido() + "\n" +
                            listaOrdenadaApellidoInv.get(2).getApellido() + "\n" +
                            listaOrdenadaApellidoInv.get(3).getApellido() + "\n" +
                            listaOrdenadaApellidoInv.get(4).getApellido() + "\n");
                    break;

            }
        }
    }
}
