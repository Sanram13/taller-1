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
public class Aplazado extends Persona {
    private String fechaAplazamiento; 

    public Aplazado(String cedula, String nombre, String apellido, String fechaAplazamiento) {
        super(cedula, nombre, apellido); 
        this.fechaAplazamiento = fechaAplazamiento; 
    } 

    public String getFechaAplazamiento() { 
        return fechaAplazamiento; 
    }

    public void setFechaAplazamiento(String fechaAplazamiento) { 
        this.fechaAplazamiento = fechaAplazamiento;
    }

    @Override 
    public String toString() { 
        return super.toString() + ", Fecha de Aplazamiento: " + fechaAplazamiento;
    }
}
