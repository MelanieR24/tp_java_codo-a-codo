
import entidad.Usuario;
import java.util.Scanner;

/**
 *
 * @author Melanie Reyes
 */
public class Main {

    /**
     * Crear un programa en java en el cual se pida al usuario ingresar su
     * nombre, apellido, edad, hobbie, editor de código preferido, sistema
     * operativo que utiliza, luego deberá mostrarse por consola los datos
     * ingresados
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean salir = false;

        System.out.println("Bienvenido al sistema!");

        System.out.println("Ingrese su usuario");
        String usuario = leer.next();
        System.out.println("Ingrese su clave");
        String clave = leer.next();

        System.out.println("Los datos ingresados son: ");
        System.out.println("Tu Usuario: " + usuario);
        System.out.println("Tu Clave: " + clave);
        do {
            try {
                System.out.println("Ingrese los siguiente datos...");
                System.out.println("Nombre: ");
                String nombre = leer.next();
                System.out.println("Apellido: ");
                String apellido = leer.next();
                System.out.println("Edad:");
                int edad = leer.nextInt();
                System.out.println("Hobbie: ");
                String hobbie = leer.next();
                System.out.println("Editor de código preferido:");
                String editor = leer.next();
                System.out.println("sistema operativo que utiliza");
                String sistema = leer.next();

                Usuario u = new Usuario(nombre, apellido, edad, hobbie, editor, sistema);

                System.out.println(u.toString());
                salir = true;
            } catch (NullPointerException e) {
                salir = false;
                throw new Exception("Alguno de los datos es nulo");
            }

        } while (salir != true);
    }

}
