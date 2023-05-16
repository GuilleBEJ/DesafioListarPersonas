import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
    private String nombre; //se crea atributo nombre
    private String apellido;//se crea atributo de clase apellido
    static Scanner sc = new Scanner(System.in);
    Persona dato, ordenar;
    public String getNombre() { //se genera el metodo get del atributo private nombre

        return nombre;
    }

    public void setNombre(String nombre) { //se genera el metodo set del atributo private nombre

        this.nombre = nombre;
    }

    public String getApellido() { //se genera el metodo get del atributo private apellido

        return apellido;
    }

    public void setApellido(String apellido) { //se genera el metodo set del atributo private apellido

        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!nombre.equals(persona.nombre)) return false;
        return apellido.equals(persona.apellido);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public Persona() {
            this.nombre = nombre;
            this.apellido = apellido;
    }

    ArrayList<Persona> listaPersonas = new ArrayList<>();//se genera un arrayList que contendra los
    // objetos de la clase Persona


    public void ingreso (){
        int op;
        System.out.println("Ingresar los datos de 5 persona" + "\n");

        for (int i = 1; i<6; i++) {
            System.out.print("Ingresar Nombre: ");//se llama al metodo Agregar y se le solicita al usuario el nombre
            nombre = sc.nextLine();
            System.out.print("Ingresar Apellido: ");//se llama al metodo Agregar y se le solicita al usuario su apellido
            apellido = sc.nextLine();
            System.out.println("");
            Persona dato = new Persona();//se instancia a la clase Persona y se genera el objeto datos para asignar los valores ingresados

            dato.setNombre(nombre);
            dato.setApellido(apellido);

            listaPersonas.add(dato);//llenamos la lista pasando el agregando el objeto

        }
    }

    public void mostrar(){

        String obj = "";

        for (int i = 0; i < listaPersonas.size(); i++){
            obj += "\n";
            obj += "Persona " + (i+1) + "\n";
            obj += "Nombre :" + listaPersonas.get(i).getNombre() + "\n";
            obj += "Apellido :" + listaPersonas.get(i).getApellido() + "\n";
            obj += "\n";
        }
        System.out.println(obj);
    }

    public static ArrayList<Persona> sortPersona (ArrayList<Persona> listaPersonas, String sortBy){
        switch (sortBy){
            case "nombre" -> listaPersonas.sort(((o1, o2) -> o1.getNombre().compareTo(o2.getNombre())));
            case "apellido" -> listaPersonas.sort(((o1, o2) -> o1.getApellido().compareTo(o2.getApellido())));
            case "apellido2" -> listaPersonas.sort(((o2, o1) -> o2.getApellido().compareTo(o1.getApellido())));
            default -> {
            }
        }
        return listaPersonas;
    }
}
