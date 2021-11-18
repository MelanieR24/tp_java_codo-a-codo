package entidad;

/**
 *
 * @author Melanie Reyes
 */
public class Usuario {

    //Atributos    
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editor;
    private String sistema;
    
    //Constructores

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, String hobbie, String editor, String sistema) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editor = editor;
        this.sistema = sistema;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    
    //metodo to string

    @Override
    public String toString() {
        return "Datos del usuario... "
                + " Nombre=" + nombre 
                + ", Apellido=" + apellido 
                + ", Edad=" + edad 
                + ", Hobbie=" + hobbie 
                + ", Editor de codigo preferido=" + editor 
                + ", Sistema operativo que usa=" + sistema;
    }
    
}
