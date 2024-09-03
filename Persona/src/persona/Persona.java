package persona;

/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Santiago Ramos
 */
public class Persona { 
    private String cedula;
    private String nombre;
    private String apellido; 

    public Persona(String cedula, String nombre, String apellido) { 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.cedula = cedula; 
    }
    
    public String getCedula() {
        return cedula; 
    } 

    public void setCedula(String cedula) {
        this.cedula = cedula; 
    }


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

    @Override
    public String toString() {
        return "Cedula: " + cedula + ", " + nombre + " " + apellido; 
    }
}
