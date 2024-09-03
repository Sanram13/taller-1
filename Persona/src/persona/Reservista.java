package persona;

/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Santiago Ramos
 */
public class Reservista extends Persona {
    private String libretaMilitar; 

    public Reservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        super(cedula, nombre, apellido); 
        this.libretaMilitar = libretaMilitar;
    } 

    public String getLibretaMilitar() { 
        return libretaMilitar; 
    }

    public void setLibretaMilitar(String libretaMilitar) {
        this.libretaMilitar = libretaMilitar; 
    }

    @Override 
    public String toString() { 
        return super.toString() + ", Libreta Militar: " + libretaMilitar; 
    }
}
