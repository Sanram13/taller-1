/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Santiago Ramos Narvaez    cod: 20222020164
 * @author Juan Felipe Wilches Gómez cod: 20231020137
 * @author Santiago Ramos
 */
public class Reclutado extends Persona { 
    private String codigoMilitar; 

    public Reclutado(String cedula, String nombre, String apellido, String codigoMilitar) {
        super(cedula, nombre, apellido);
        this.codigoMilitar = codigoMilitar;
    } 

    public String getCodigoMilitar() { 
        return codigoMilitar; 
    }

    public void setCodigoMilitar(String codigoMilitar) { 
        this.codigoMilitar = codigoMilitar; 
    } 

    @Override 
    public String toString() { 
        return super.toString() + ", Codigo Militar: " + codigoMilitar; 
    }
}
