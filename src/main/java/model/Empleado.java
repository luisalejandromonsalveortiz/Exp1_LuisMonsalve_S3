
package model;

/**
 *
 * @author Jano
 */
public class Empleado extends Persona {
    private String rol; // Ej: Guía Turístico, Operador, Administrador
    private double sueldoBase;

    public Empleado(String rut, String nombre, String email, String telefono, Direccion direccion, String rol, double sueldoBase) {
        super(rut, nombre, email, telefono, direccion); // Llama al constructor de Persona
        this.rol = rol;
        this.sueldoBase = sueldoBase;
    }

    // Getters y Setters
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }

    @Override
    public String toString() {
        return super.toString() + " | Rol Interno: " + rol + " | Sueldo Base: $" + sueldoBase;
    }
}
