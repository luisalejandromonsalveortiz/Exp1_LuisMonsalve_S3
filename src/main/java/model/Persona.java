
package model;

/**
 *
 * @author Jano
 */
public class Persona {
    private String rut;
    private String nombre;
    private String email;
    private String telefono;
    private Direccion direccion; // Composición

    public Persona(String rut, String nombre, String email, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Email: " + email + " | Tel: " + telefono + " | Dirección: [" + direccion + "]";
    }
}
